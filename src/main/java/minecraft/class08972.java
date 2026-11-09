package minecraft;

public enum class08972 implements class05033 {
   field_61446("unconnected"),
   field_61447("right"),
   field_61448("center"),
   field_61449("left");

   private final String field_61450;

   public class08972 L() {
      return switch (this) {
         case field_61446, field_61449 -> field_61449;
         case field_61447, field_61448 -> field_61448;
      };
   }

   private class08972(String var3) {
      this.field_61450 = var3;
   }

   @Override
   public String toString() {
      return this.method_15434();
   }

   public class08972 i() {
      return switch (this) {
         case field_61446, field_61449 -> field_61446;
         case field_61447, field_61448 -> field_61447;
      };
   }

   public class08972 u() {
      return switch (this) {
         case field_61446, field_61447 -> field_61447;
         case field_61448, field_61449 -> field_61448;
      };
   }

   public boolean y() {
      return this != field_61448;
   }

   public boolean N(class08972 var1) {
      return this == field_61448 || this == var1;
   }

   public boolean N() {
      return this != field_61446;
   }

   public class08972 R() {
      return switch (this) {
         case field_61446, field_61447 -> field_61446;
         case field_61448, field_61449 -> field_61449;
      };
   }

   @Override
   public String method_15434() {
      return this.field_61450;
   }
}
