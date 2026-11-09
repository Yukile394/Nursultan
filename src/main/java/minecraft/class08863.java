package minecraft;

class class08863 extends class08499 {
   class08863(class08524 var1, class08524 var2) {
      super(var1, var2);
   }

   @Override
   protected boolean N(char var1) {
      return switch (var1) {
         case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '_' -> true;
         default -> false;
      };
   }
}
