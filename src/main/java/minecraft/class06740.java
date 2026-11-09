package minecraft;

public record class06740(class06889 a, class06889 b, class06889 c, class06889 d, class06747 style) implements class06730 {
   public class06889 L() {
      return this.c;
   }

   public class06740(class06889 a, class06889 b, class06889 c, class06889 d, class06747 style) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
      this.style = style;
   }

   public class06747 i() {
      return this.style;
   }

   public class06889 u() {
      return this.d;
   }

   public class06889 y() {
      return this.b;
   }

   public class06889 N() {
      return this.a;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class06740 N(class06889 var0, class06889 var1, class07211 var2, class06747 var3) {
      return switch (var2) {
         case field_11033 -> new class06740(
            new class06889(var0.M, var0.B, var0.Z),
            new class06889(var1.M, var0.B, var0.Z),
            new class06889(var1.M, var0.B, var1.Z),
            new class06889(var0.M, var0.B, var1.Z),
            var3
         );
         case field_11036 -> new class06740(
            new class06889(var0.M, var1.B, var0.Z),
            new class06889(var0.M, var1.B, var1.Z),
            new class06889(var1.M, var1.B, var1.Z),
            new class06889(var1.M, var1.B, var0.Z),
            var3
         );
         case field_11043 -> new class06740(
            new class06889(var0.M, var0.B, var0.Z),
            new class06889(var0.M, var1.B, var0.Z),
            new class06889(var1.M, var1.B, var0.Z),
            new class06889(var1.M, var0.B, var0.Z),
            var3
         );
         case field_11035 -> new class06740(
            new class06889(var0.M, var0.B, var1.Z),
            new class06889(var1.M, var0.B, var1.Z),
            new class06889(var1.M, var1.B, var1.Z),
            new class06889(var0.M, var1.B, var1.Z),
            var3
         );
         case field_11039 -> new class06740(
            new class06889(var0.M, var0.B, var0.Z),
            new class06889(var0.M, var0.B, var1.Z),
            new class06889(var0.M, var1.B, var1.Z),
            new class06889(var0.M, var1.B, var0.Z),
            var3
         );
         case field_11034 -> new class06740(
            new class06889(var1.M, var0.B, var0.Z),
            new class06889(var1.M, var1.B, var0.Z),
            new class06889(var1.M, var1.B, var1.Z),
            new class06889(var1.M, var0.B, var1.Z),
            var3
         );
      };
   }

   @Override
   public void N(class06722 var1, float var2) {
      if (this.style.N()) {
         int i = this.style.y(var2);
         var1.N(this.a, this.b, this.c, this.d, i);
      }

      if (this.style.y()) {
         int j = this.style.N(var2);
         var1.N(this.a, this.b, j, this.style.u());
         var1.N(this.b, this.c, j, this.style.u());
         var1.N(this.c, this.d, j, this.style.u());
         var1.N(this.d, this.a, j, this.style.u());
      }
   }
}
