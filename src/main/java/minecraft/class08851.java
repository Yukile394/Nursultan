package minecraft;

class class08851 extends class08522 {
   class08851(int var1, class08524 var2) {
      super(var1, var2);
   }

   @Override
   protected boolean N(char var1) {
      return switch (var1) {
         case '"', '\'', '\\' -> false;
         default -> true;
      };
   }
}
