package minecraft;

import java.util.UUID;

public record class00014(class00039 operation, class00037 waypoint) implements class00381<class07280> {
   public static final class02362<class04247, class00014> N = class02362.N(class00039.field_59617, class00014::N, class00037.y, class00014::y, class00014::new);

   public class00014(class00039 operation, class00037 waypoint) {
      super();
      this.operation = operation;
      this.waypoint = waypoint;
   }

   public static class00014 y(UUID var0, class00028 var1, class00753 var2) {
      return new class00014(class00039.field_59615, class00037.N(var0, var1, var2));
   }

   public static class00014 y(UUID var0, class00028 var1, float var2) {
      return new class00014(class00039.field_59615, class00037.N(var0, var1, var2));
   }

   public class00037 y() {
      return this.waypoint;
   }

   public static class00014 y(UUID var0, class00028 var1, class07321 var2) {
      return new class00014(class00039.field_59615, class00037.N(var0, var1, var2));
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class00039 N() {
      return this.operation;
   }

   public static class00014 N(UUID var0, class00028 var1, class00753 var2) {
      return new class00014(class00039.field_59613, class00037.N(var0, var1, var2));
   }

   public static class00014 N(UUID var0, class00028 var1, class07321 var2) {
      return new class00014(class00039.field_59613, class00037.N(var0, var1, var2));
   }

   public static class00014 N(UUID var0, class00028 var1, float var2) {
      return new class00014(class00039.field_59613, class00037.N(var0, var1, var2));
   }

   public void N(class00005 var1) {
      this.operation.field_59618.accept(var1, this.waypoint);
   }

   public static class00014 N(UUID var0) {
      return new class00014(class00039.field_59614, class00037.N(var0));
   }

   @Override
   public class02897<class00014> method_65080() {
      return class04248.ys;
   }
}
