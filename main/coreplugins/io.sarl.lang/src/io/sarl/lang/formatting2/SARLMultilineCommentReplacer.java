/*
 * $Id$
 *
 * SARL is an general-purpose agent programming language.
 * More details on http://www.sarl.io
 *
 * Copyright (C) 2014-2017 the original authors or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.sarl.lang.formatting2;

import javax.inject.Inject;

import org.eclipse.xtext.formatting2.IHiddenRegionFormatting;
import org.eclipse.xtext.formatting2.ITextReplacerContext;
import org.eclipse.xtext.formatting2.internal.CommentReplacer;
import org.eclipse.xtext.formatting2.internal.WhitespaceReplacer;
import org.eclipse.xtext.formatting2.regionaccess.IComment;

import io.sarl.lang.bugfixes.unpublished.BugMultilineCommentIndentation;
import io.sarl.lang.documentation.IDocumentationFormatter;

/**
 * Format the multiline comment according to the SARL standards.
 *
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 */
public class SARLMultilineCommentReplacer extends CommentReplacer {

	@Inject
	private IDocumentationFormatter formatter;

	@Inject
	private BugMultilineCommentIndentation bugfix;

	/** Construct the replacer.
	 *
	 * @param comment the comment to format.
	 */
	public SARLMultilineCommentReplacer(IComment comment) {
		super(comment);
	}

	@Override
	public void configureWhitespace(WhitespaceReplacer leading, WhitespaceReplacer trailing) {
		if (leading.getRegion().getOffset() > 0) {
			final IHiddenRegionFormatting formatting = leading.getFormatting();
			formatting.setNewLinesDefault(1);
			formatting.setNewLinesMin(1);
			formatting.setNewLinesMax(1);
			formatting.setNoIndentation(false);
		}
		if (trailing.getRegion().getOffset() > 0) {
			final IHiddenRegionFormatting formatting = trailing.getFormatting();
			formatting.setNewLinesDefault(1);
			formatting.setNewLinesMin(1);
			formatting.setNewLinesMax(1);
			formatting.setNoIndentation(false);
		}
	}

	@Override
	public ITextReplacerContext createReplacements(ITextReplacerContext context) {
		final IComment comment = getComment();
		if (context != null && comment != null) {
			this.formatter.formatMultilineComment(this.bugfix.fix(context, comment), comment);
		}
		return context;
	}

}
