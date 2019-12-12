package net.devtech.yajslib.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * any method annotated with this should only have one parameter as the output stream, and must be declared <b>final</b>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Writer {
	/**
	 * the version string of the serializer, this is generated by the AP
	 * @return the version number
	 */
	long value();
}
