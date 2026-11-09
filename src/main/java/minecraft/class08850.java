package minecraft;

class class08850 extends class08499 {
   class08850(class08524 var1, class08524 var2) {
      super(var1, var2);
   }

   @Override
   protected boolean N(char var1) {
      return switch (var1) {
         case '0', '1', '_' -> true;
         default -> false;
      };
   }
}
