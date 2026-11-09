package minecraft;

public record class03283(int x, int y) {
   public class03283(int x, int y) {
      super();
      this.x = x;
      this.y = y;
   }

   public int N(class03287 var1) {
      return switch (var1) {
         case field_41822 -> this.x;
         case field_41823 -> this.y;
      };
   }

   public int N() {
      return this.x;
   }

   public static class03283 N(class03287 var0, int var1, int var2) {
      return switch (var0) {
         case field_41822 -> new class03283(var1, var2);
         case field_41823 -> new class03283(var2, var1);
      };
   }

   public class03283 N(class03249 var1) {
      return switch (var1) {
         case field_41827 -> new class03283(this.x, this.y + 1);
         case field_41826 -> new class03283(this.x, this.y - 1);
         case field_41828 -> new class03283(this.x - 1, this.y);
         case field_41829 -> new class03283(this.x + 1, this.y);
      };
   }
}
