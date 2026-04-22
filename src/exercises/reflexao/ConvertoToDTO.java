package exercises.reflexao;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ConvertoToDTO {

    public <I, O> O converter(I input) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> source = input.getClass();
        Class<?> target = Class.forName(source + "DTO");
        O targetInstance = (O) target.getDeclaredConstructor().newInstance();

        Field[] sourceFields = source.getDeclaredFields();
        Field[] targetFields = target.getDeclaredFields();

        Arrays.stream(sourceFields).forEach(sourceField ->
                Arrays.stream(targetFields).forEach(targetField -> {
                    validate(sourceField, targetField);
                    try {
                        targetField.set(targetInstance, sourceField.get(input));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }));

        return targetInstance;
    }

    public void validate (Field field1, Field field2) {
        if (field1.getName().equals(field2.getName())
        && field1.getType().equals(field2.getType())) {
            field1.setAccessible(true);
            field2.setAccessible(true);
        }
    }
}
/*









Exponential / Logarithmic
Math.exp(a)
Math.log(a)
Math.log10(a)
Math.log1p(a)
Math.expm1(a)

Random
Math.random()

Floating-Point Helpers
Math.signum(x)
Math.copySign(a, b)
Math.getExponent(x)
Math.nextAfter(start, direction)
Math.nextUp(x)
Math.nextDown(x)
Math.ulp(x)
Math.scalb(x, factor)

Exact Arithmetic
Math.addExact(a, b)
Math.subtractExact(a, b)
Math.multiplyExact(a, b)
Math.incrementExact(a)
Math.decrementExact(a)
Math.negateExact(a)
Math.toIntExact(value)

Division / Modulus
Math.floorDiv(a, b)
Math.floorMod(a, b)

Misc Advanced
Math.fma(a, b, c)
 */