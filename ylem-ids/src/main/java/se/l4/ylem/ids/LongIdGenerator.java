package se.l4.ylem.ids;

/**
 * Generator for long based identifiers.
 *
 * @author Andreas Holstenson
 *
 */
public interface LongIdGenerator
{
	/**
	 * Get the next identifier.
	 *
	 * @return
	 */
	long next();
}
