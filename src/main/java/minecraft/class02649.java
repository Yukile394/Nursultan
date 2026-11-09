package minecraft;

import java.util.OptionalInt;

public record class02649(class02627 positionFunction, float uncertainty, float power, OptionalInt overrideDispenseEvent) {
   public static final class02649 N = N().N();

   public float L() {
      return this.uncertainty;
   }

   public class02649(class02627 positionFunction, float uncertainty, float power, OptionalInt overrideDispenseEvent) {
      this.positionFunction = positionFunction;
      this.uncertainty = uncertainty;
      this.power = power;
      this.overrideDispenseEvent = overrideDispenseEvent;
   }

   public OptionalInt i() {
      return this.overrideDispenseEvent;
   }

   public float u() {
      return this.power;
   }

   public class02627 y() {
      return this.positionFunction;
   }

   public static class02632 N() {
      return new class02632();
   }
}
