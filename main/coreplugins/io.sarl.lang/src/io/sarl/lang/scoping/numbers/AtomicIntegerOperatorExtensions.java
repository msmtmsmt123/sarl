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

// THIS FILE IS AUTO-GENERATED. DO NOT CHANGE MANUALLY

package io.sarl.lang.scoping.numbers;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.eclipse.xtext.xbase.lib.Inline;
import org.eclipse.xtext.xbase.lib.Pure;

/** Provide static operators for numbers of type {@code AtomicInteger}.
 *
 * @author $Author: sgalland$
 * @version $FullVersion$
 * @mavengroupid $GroupId$
 * @mavenartifactid $ArtifactId$
 * @since 0.7
 * @see "https://github.com/eclipse/xtext-extras/issues/186"
 */
@SuppressWarnings("all")
public final class AtomicIntegerOperatorExtensions {

	private AtomicIntegerOperatorExtensions() {
		//
	}

	// BEGIN GENERATED BLOCK

	/** The unary {@code minus} operator. This is the equivalent to
	 * the Java's {@code -} function.
	 *
	 * @param i a number.
	 * @return {@code -i}
	 */
	@Pure
	@Inline(value = "(-($1).intValue())", constantExpression=true)
	public static int operator_minus(AtomicInteger i) {
		return -i.intValue();
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() + $2)", constantExpression=true)
	public static long operator_plus(AtomicInteger a, long b) {
		return a.longValue() + b;
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() + $2)", constantExpression=true)
	public static int operator_plus(AtomicInteger a, byte b) {
		return a.intValue() + b;
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() + $2)", constantExpression=true)
	public static int operator_plus(AtomicInteger a, int b) {
		return a.intValue() + b;
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() + $2)", constantExpression=true)
	public static int operator_plus(AtomicInteger a, short b) {
		return a.intValue() + b;
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() + $2)", constantExpression=true)
	public static double operator_plus(AtomicInteger a, double b) {
		return a.doubleValue() + b;
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() + $2)", constantExpression=true)
	public static float operator_plus(AtomicInteger a, float b) {
		return a.floatValue() + b;
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() + ($2).longValue())", constantExpression=true)
	public static long operator_plus(AtomicInteger a, Long b) {
		return a.longValue() + b.longValue();
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() + ($2).intValue())", constantExpression=true)
	public static int operator_plus(AtomicInteger a, Byte b) {
		return a.intValue() + b.intValue();
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() + ($2).floatValue())", constantExpression=true)
	public static float operator_plus(AtomicInteger a, Float b) {
		return a.floatValue() + b.floatValue();
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() + ($2).intValue())", constantExpression=true)
	public static int operator_plus(AtomicInteger a, Integer b) {
		return a.intValue() + b.intValue();
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() + ($2).doubleValue())", constantExpression=true)
	public static double operator_plus(AtomicInteger a, Double b) {
		return a.doubleValue() + b.doubleValue();
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() + ($2).intValue())", constantExpression=true)
	public static int operator_plus(AtomicInteger a, Short b) {
		return a.intValue() + b.intValue();
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() + ($2).intValue())", constantExpression=true)
	public static int operator_plus(AtomicInteger a, AtomicInteger b) {
		return a.intValue() + b.intValue();
	}

	/** The binary {@code plus} operator. This is the equivalent to
	 * the Java {@code +} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a+b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() + ($2).longValue())", constantExpression=true)
	public static long operator_plus(AtomicInteger a, AtomicLong b) {
		return a.longValue() + b.longValue();
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).longValue(), $2)", imported = Math.class)
	public static double operator_power(AtomicInteger a, long b) {
		return Math.pow(a.longValue(), b);
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).intValue(), $2)", imported = Math.class)
	public static double operator_power(AtomicInteger a, byte b) {
		return Math.pow(a.intValue(), b);
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).intValue(), $2)", imported = Math.class)
	public static double operator_power(AtomicInteger a, int b) {
		return Math.pow(a.intValue(), b);
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).intValue(), $2)", imported = Math.class)
	public static double operator_power(AtomicInteger a, short b) {
		return Math.pow(a.intValue(), b);
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).doubleValue(), $2)", imported = Math.class)
	public static double operator_power(AtomicInteger a, double b) {
		return Math.pow(a.doubleValue(), b);
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).floatValue(), $2)", imported = Math.class)
	public static double operator_power(AtomicInteger a, float b) {
		return Math.pow(a.floatValue(), b);
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).longValue(), ($2).longValue())", imported = Math.class)
	public static double operator_power(AtomicInteger a, Long b) {
		return Math.pow(a.longValue(), b.longValue());
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).intValue(), ($2).intValue())", imported = Math.class)
	public static double operator_power(AtomicInteger a, Byte b) {
		return Math.pow(a.intValue(), b.intValue());
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).floatValue(), ($2).floatValue())", imported = Math.class)
	public static double operator_power(AtomicInteger a, Float b) {
		return Math.pow(a.floatValue(), b.floatValue());
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).intValue(), ($2).intValue())", imported = Math.class)
	public static double operator_power(AtomicInteger a, Integer b) {
		return Math.pow(a.intValue(), b.intValue());
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).doubleValue(), ($2).doubleValue())", imported = Math.class)
	public static double operator_power(AtomicInteger a, Double b) {
		return Math.pow(a.doubleValue(), b.doubleValue());
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).intValue(), ($2).intValue())", imported = Math.class)
	public static double operator_power(AtomicInteger a, Short b) {
		return Math.pow(a.intValue(), b.intValue());
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).intValue(), ($2).intValue())", imported = Math.class)
	public static double operator_power(AtomicInteger a, AtomicInteger b) {
		return Math.pow(a.intValue(), b.intValue());
	}

	/** The binary {@code power} operator. This is the equivalent to
	 * the Java's {@code Math.pow()} function.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code Math::pow(a, b)}
	 */
	@Pure
	@Inline(value = "$3.pow(($1).longValue(), ($2).longValue())", imported = Math.class)
	public static double operator_power(AtomicInteger a, AtomicLong b) {
		return Math.pow(a.longValue(), b.longValue());
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, long b) {
		return a.longValue() >= b;
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, byte b) {
		return a.intValue() >= b;
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, int b) {
		return a.intValue() >= b;
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, short b) {
		return a.intValue() >= b;
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, double b) {
		return a.doubleValue() >= b;
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, float b) {
		return a.floatValue() >= b;
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() >= ($2).longValue())", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, Long b) {
		return a.longValue() >= b.longValue();
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() >= ($2).intValue())", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, Byte b) {
		return a.intValue() >= b.intValue();
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() >= ($2).floatValue())", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, Float b) {
		return a.floatValue() >= b.floatValue();
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() >= ($2).intValue())", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, Integer b) {
		return a.intValue() >= b.intValue();
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() >= ($2).doubleValue())", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, Double b) {
		return a.doubleValue() >= b.doubleValue();
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() >= ($2).intValue())", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, Short b) {
		return a.intValue() >= b.intValue();
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() >= ($2).intValue())", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, AtomicInteger b) {
		return a.intValue() >= b.intValue();
	}

	/** The binary {@code greaterEqualsThan} operator. This is the equivalent
	 * to the Java {@code &gt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;=b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() >= ($2).longValue())", constantExpression=true)
	public static boolean operator_greaterEqualsThan(AtomicInteger a, AtomicLong b) {
		return a.longValue() >= b.longValue();
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() != $2)", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, long b) {
		return a.longValue() != b;
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() != $2)", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, byte b) {
		return a.intValue() != b;
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() != $2)", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, int b) {
		return a.intValue() != b;
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() != $2)", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, short b) {
		return a.intValue() != b;
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() != $2)", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, double b) {
		return a.doubleValue() != b;
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() != $2)", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, float b) {
		return a.floatValue() != b;
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() != ($2).longValue())", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, Long b) {
		return a.longValue() != b.longValue();
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() != ($2).intValue())", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, Byte b) {
		return a.intValue() != b.intValue();
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() != ($2).floatValue())", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, Float b) {
		return a.floatValue() != b.floatValue();
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() != ($2).intValue())", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, Integer b) {
		return a.intValue() != b.intValue();
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() != ($2).doubleValue())", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, Double b) {
		return a.doubleValue() != b.doubleValue();
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() != ($2).intValue())", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, Short b) {
		return a.intValue() != b.intValue();
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() != ($2).intValue())", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, AtomicInteger b) {
		return a.intValue() != b.intValue();
	}

	/** The binary {@code notEquals} operator. This is the equivalent
	 * to the Java {@code !=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a!=b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() != ($2).longValue())", constantExpression=true)
	public static boolean operator_notEquals(AtomicInteger a, AtomicLong b) {
		return a.longValue() != b.longValue();
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() / $2)", constantExpression=true)
	public static long operator_divide(AtomicInteger a, long b) {
		return a.longValue() / b;
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() / $2)", constantExpression=true)
	public static int operator_divide(AtomicInteger a, byte b) {
		return a.intValue() / b;
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() / $2)", constantExpression=true)
	public static int operator_divide(AtomicInteger a, int b) {
		return a.intValue() / b;
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() / $2)", constantExpression=true)
	public static int operator_divide(AtomicInteger a, short b) {
		return a.intValue() / b;
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() / $2)", constantExpression=true)
	public static double operator_divide(AtomicInteger a, double b) {
		return a.doubleValue() / b;
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() / $2)", constantExpression=true)
	public static float operator_divide(AtomicInteger a, float b) {
		return a.floatValue() / b;
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() / ($2).longValue())", constantExpression=true)
	public static long operator_divide(AtomicInteger a, Long b) {
		return a.longValue() / b.longValue();
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() / ($2).intValue())", constantExpression=true)
	public static int operator_divide(AtomicInteger a, Byte b) {
		return a.intValue() / b.intValue();
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() / ($2).floatValue())", constantExpression=true)
	public static float operator_divide(AtomicInteger a, Float b) {
		return a.floatValue() / b.floatValue();
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() / ($2).intValue())", constantExpression=true)
	public static int operator_divide(AtomicInteger a, Integer b) {
		return a.intValue() / b.intValue();
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() / ($2).doubleValue())", constantExpression=true)
	public static double operator_divide(AtomicInteger a, Double b) {
		return a.doubleValue() / b.doubleValue();
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() / ($2).intValue())", constantExpression=true)
	public static int operator_divide(AtomicInteger a, Short b) {
		return a.intValue() / b.intValue();
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() / ($2).intValue())", constantExpression=true)
	public static int operator_divide(AtomicInteger a, AtomicInteger b) {
		return a.intValue() / b.intValue();
	}

	/** The binary {@code divide} operator. This is the equivalent to
	 * the Java {@code /} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a/b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() / ($2).longValue())", constantExpression=true)
	public static long operator_divide(AtomicInteger a, AtomicLong b) {
		return a.longValue() / b.longValue();
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, long b) {
		return a.longValue() <= b;
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, byte b) {
		return a.intValue() <= b;
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, int b) {
		return a.intValue() <= b;
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, short b) {
		return a.intValue() <= b;
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, double b) {
		return a.doubleValue() <= b;
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, float b) {
		return a.floatValue() <= b;
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() <= ($2).longValue())", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, Long b) {
		return a.longValue() <= b.longValue();
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() <= ($2).intValue())", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, Byte b) {
		return a.intValue() <= b.intValue();
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() <= ($2).floatValue())", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, Float b) {
		return a.floatValue() <= b.floatValue();
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() <= ($2).intValue())", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, Integer b) {
		return a.intValue() <= b.intValue();
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() <= ($2).doubleValue())", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, Double b) {
		return a.doubleValue() <= b.doubleValue();
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() <= ($2).intValue())", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, Short b) {
		return a.intValue() <= b.intValue();
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() <= ($2).intValue())", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, AtomicInteger b) {
		return a.intValue() <= b.intValue();
	}

	/** The binary {@code lessEqualsThan} operator. This is the equivalent
	 * to the Java {@code &lt;=} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;=b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() <= ($2).longValue())", constantExpression=true)
	public static boolean operator_lessEqualsThan(AtomicInteger a, AtomicLong b) {
		return a.longValue() <= b.longValue();
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() * $2)", constantExpression=true)
	public static long operator_multiply(AtomicInteger a, long b) {
		return a.longValue() * b;
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() * $2)", constantExpression=true)
	public static int operator_multiply(AtomicInteger a, byte b) {
		return a.intValue() * b;
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() * $2)", constantExpression=true)
	public static int operator_multiply(AtomicInteger a, int b) {
		return a.intValue() * b;
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() * $2)", constantExpression=true)
	public static int operator_multiply(AtomicInteger a, short b) {
		return a.intValue() * b;
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() * $2)", constantExpression=true)
	public static double operator_multiply(AtomicInteger a, double b) {
		return a.doubleValue() * b;
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() * $2)", constantExpression=true)
	public static float operator_multiply(AtomicInteger a, float b) {
		return a.floatValue() * b;
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() * ($2).longValue())", constantExpression=true)
	public static long operator_multiply(AtomicInteger a, Long b) {
		return a.longValue() * b.longValue();
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() * ($2).intValue())", constantExpression=true)
	public static int operator_multiply(AtomicInteger a, Byte b) {
		return a.intValue() * b.intValue();
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() * ($2).floatValue())", constantExpression=true)
	public static float operator_multiply(AtomicInteger a, Float b) {
		return a.floatValue() * b.floatValue();
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() * ($2).intValue())", constantExpression=true)
	public static int operator_multiply(AtomicInteger a, Integer b) {
		return a.intValue() * b.intValue();
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() * ($2).doubleValue())", constantExpression=true)
	public static double operator_multiply(AtomicInteger a, Double b) {
		return a.doubleValue() * b.doubleValue();
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() * ($2).intValue())", constantExpression=true)
	public static int operator_multiply(AtomicInteger a, Short b) {
		return a.intValue() * b.intValue();
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() * ($2).intValue())", constantExpression=true)
	public static int operator_multiply(AtomicInteger a, AtomicInteger b) {
		return a.intValue() * b.intValue();
	}

	/** The binary {@code multiply} operator. This is the equivalent to
	 * the Java {@code *} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a*b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() * ($2).longValue())", constantExpression=true)
	public static long operator_multiply(AtomicInteger a, AtomicLong b) {
		return a.longValue() * b.longValue();
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() == $2)", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, long b) {
		return a.longValue() == b;
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() == $2)", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, byte b) {
		return a.intValue() == b;
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() == $2)", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, int b) {
		return a.intValue() == b;
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() == $2)", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, short b) {
		return a.intValue() == b;
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() == $2)", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, double b) {
		return a.doubleValue() == b;
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() == $2)", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, float b) {
		return a.floatValue() == b;
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() == ($2).longValue())", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, Long b) {
		return a.longValue() == b.longValue();
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() == ($2).intValue())", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, Byte b) {
		return a.intValue() == b.intValue();
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() == ($2).floatValue())", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, Float b) {
		return a.floatValue() == b.floatValue();
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() == ($2).intValue())", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, Integer b) {
		return a.intValue() == b.intValue();
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() == ($2).doubleValue())", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, Double b) {
		return a.doubleValue() == b.doubleValue();
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() == ($2).intValue())", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, Short b) {
		return a.intValue() == b.intValue();
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() == ($2).intValue())", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, AtomicInteger b) {
		return a.intValue() == b.intValue();
	}

	/**
	 *The binary {@code equals} operator. This is the equivalent to the Java {@code ==} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a==b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() == ($2).longValue())", constantExpression=true)
	public static boolean operator_equals(AtomicInteger a, AtomicLong b) {
		return a.longValue() == b.longValue();
	}

	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() > $2)", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, long b) {
		return a.longValue() > b;
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() > $2)", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, byte b) {
		return a.intValue() > b;
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() > $2)", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, int b) {
		return a.intValue() > b;
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() > $2)", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, short b) {
		return a.intValue() > b;
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() > $2)", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, double b) {
		return a.doubleValue() > b;
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() > $2)", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, float b) {
		return a.floatValue() > b;
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() > ($2).longValue())", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, Long b) {
		return a.longValue() > b.longValue();
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() > ($2).intValue())", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, Byte b) {
		return a.intValue() > b.intValue();
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() > ($2).floatValue())", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, Float b) {
		return a.floatValue() > b.floatValue();
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() > ($2).intValue())", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, Integer b) {
		return a.intValue() > b.intValue();
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() > ($2).doubleValue())", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, Double b) {
		return a.doubleValue() > b.doubleValue();
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() > ($2).intValue())", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, Short b) {
		return a.intValue() > b.intValue();
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() > ($2).intValue())", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, AtomicInteger b) {
		return a.intValue() > b.intValue();
	}


	/** The binary {@code greaterThan} operator. This is the equivalent
	 * to the Java {@code &gt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&gt;b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() > ($2).longValue())", constantExpression=true)
	public static boolean operator_greaterThan(AtomicInteger a, AtomicLong b) {
		return a.longValue() > b.longValue();
	}


	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() % $2)", constantExpression=true)
	public static long operator_modulo(AtomicInteger a, long b) {
		return a.longValue() % b;
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() % $2)", constantExpression=true)
	public static int operator_modulo(AtomicInteger a, byte b) {
		return a.intValue() % b;
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() % $2)", constantExpression=true)
	public static int operator_modulo(AtomicInteger a, int b) {
		return a.intValue() % b;
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() % $2)", constantExpression=true)
	public static int operator_modulo(AtomicInteger a, short b) {
		return a.intValue() % b;
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() % $2)", constantExpression=true)
	public static double operator_modulo(AtomicInteger a, double b) {
		return a.doubleValue() % b;
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() % $2)", constantExpression=true)
	public static float operator_modulo(AtomicInteger a, float b) {
		return a.floatValue() % b;
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() % ($2).longValue())", constantExpression=true)
	public static long operator_modulo(AtomicInteger a, Long b) {
		return a.longValue() % b.longValue();
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() % ($2).intValue())", constantExpression=true)
	public static int operator_modulo(AtomicInteger a, Byte b) {
		return a.intValue() % b.intValue();
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() % ($2).floatValue())", constantExpression=true)
	public static float operator_modulo(AtomicInteger a, Float b) {
		return a.floatValue() % b.floatValue();
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() % ($2).intValue())", constantExpression=true)
	public static int operator_modulo(AtomicInteger a, Integer b) {
		return a.intValue() % b.intValue();
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() % ($2).doubleValue())", constantExpression=true)
	public static double operator_modulo(AtomicInteger a, Double b) {
		return a.doubleValue() % b.doubleValue();
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() % ($2).intValue())", constantExpression=true)
	public static int operator_modulo(AtomicInteger a, Short b) {
		return a.intValue() % b.intValue();
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() % ($2).intValue())", constantExpression=true)
	public static int operator_modulo(AtomicInteger a, AtomicInteger b) {
		return a.intValue() % b.intValue();
	}

	/** The binary {@code modulo} operator. This is the equivalent to
	 * the Java {@code %} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a%b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() % ($2).longValue())", constantExpression=true)
	public static long operator_modulo(AtomicInteger a, AtomicLong b) {
		return a.longValue() % b.longValue();
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() - $2)", constantExpression=true)
	public static long operator_minus(AtomicInteger a, long b) {
		return a.longValue() - b;
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() - $2)", constantExpression=true)
	public static int operator_minus(AtomicInteger a, byte b) {
		return a.intValue() - b;
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() - $2)", constantExpression=true)
	public static int operator_minus(AtomicInteger a, int b) {
		return a.intValue() - b;
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() - $2)", constantExpression=true)
	public static int operator_minus(AtomicInteger a, short b) {
		return a.intValue() - b;
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() - $2)", constantExpression=true)
	public static double operator_minus(AtomicInteger a, double b) {
		return a.doubleValue() - b;
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() - $2)", constantExpression=true)
	public static float operator_minus(AtomicInteger a, float b) {
		return a.floatValue() - b;
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() - ($2).longValue())", constantExpression=true)
	public static long operator_minus(AtomicInteger a, Long b) {
		return a.longValue() - b.longValue();
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() - ($2).intValue())", constantExpression=true)
	public static int operator_minus(AtomicInteger a, Byte b) {
		return a.intValue() - b.intValue();
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() - ($2).floatValue())", constantExpression=true)
	public static float operator_minus(AtomicInteger a, Float b) {
		return a.floatValue() - b.floatValue();
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() - ($2).intValue())", constantExpression=true)
	public static int operator_minus(AtomicInteger a, Integer b) {
		return a.intValue() - b.intValue();
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() - ($2).doubleValue())", constantExpression=true)
	public static double operator_minus(AtomicInteger a, Double b) {
		return a.doubleValue() - b.doubleValue();
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() - ($2).intValue())", constantExpression=true)
	public static int operator_minus(AtomicInteger a, Short b) {
		return a.intValue() - b.intValue();
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() - ($2).intValue())", constantExpression=true)
	public static int operator_minus(AtomicInteger a, AtomicInteger b) {
		return a.intValue() - b.intValue();
	}

	/** The binary {@code minus} operator. This is the equivalent to
	 * the Java {@code -} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a-b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() - ($2).longValue())", constantExpression=true)
	public static long operator_minus(AtomicInteger a, AtomicLong b) {
		return a.longValue() - b.longValue();
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() < $2)", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, long b) {
		return a.longValue() < b;
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() < $2)", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, byte b) {
		return a.intValue() < b;
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() < $2)", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, int b) {
		return a.intValue() < b;
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() < $2)", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, short b) {
		return a.intValue() < b;
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() < $2)", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, double b) {
		return a.doubleValue() < b;
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() < $2)", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, float b) {
		return a.floatValue() < b;
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() < ($2).longValue())", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, Long b) {
		return a.longValue() < b.longValue();
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() < ($2).intValue())", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, Byte b) {
		return a.intValue() < b.intValue();
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).floatValue() < ($2).floatValue())", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, Float b) {
		return a.floatValue() < b.floatValue();
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() < ($2).intValue())", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, Integer b) {
		return a.intValue() < b.intValue();
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).doubleValue() < ($2).doubleValue())", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, Double b) {
		return a.doubleValue() < b.doubleValue();
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() < ($2).intValue())", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, Short b) {
		return a.intValue() < b.intValue();
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).intValue() < ($2).intValue())", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, AtomicInteger b) {
		return a.intValue() < b.intValue();
	}

	/** The binary {@code lessThan} operator. This is the equivalent to
	 * the Java {@code &lt;} operator.
	 *
	 * @param a a number.
	 * @param b a number.
	 * @return {@code a&lt;b}
	 */
	@Pure
	@Inline(value = "(($1).longValue() < ($2).longValue())", constantExpression=true)
	public static boolean operator_lessThan(AtomicInteger a, AtomicLong b) {
		return a.longValue() < b.longValue();
	}

	// END GENERATED BLOCK

}
