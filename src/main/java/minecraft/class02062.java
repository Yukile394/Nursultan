package minecraft;

public enum class02062 {
   field_40789,
   field_40790;

   int L(class02102 var1) {
      return switch (this) {
         case field_40789 -> var1.method_46426();
         case field_40790 -> var1.method_46427();
      };
   }

   private class02062() {
   }

   int u(class02102 var1) {
      return switch (this) {
         case field_40789 -> var1.method_46427();
         case field_40790 -> var1.method_46426();
      };
   }

   int y(class02070 var1) {
      return switch (this) {
         case field_40789 -> var1.N();
         case field_40790 -> var1.y();
      };
   }

   int y(class02102 var1) {
      return switch (this) {
         case field_40789 -> var1.method_25364();
         case field_40790 -> var1.method_25368();
      };
   }

   int N(class02070 var1) {
      return switch (this) {
         case field_40789 -> var1.y();
         case field_40790 -> var1.N();
      };
   }

   void N(class02070 var1, int var2, int var3) {
      switch (this) {
         case field_40789:
            var1.y(var2, var3);
            break;
         case field_40790:
            var1.N(var2, var3);
      }
   }

   void N(class02070 var1, int var2) {
      switch (this) {
         case field_40789:
            var1.N(var2, var1.y());
            break;
         case field_40790:
            var1.y(var2, var1.N());
      }
   }

   int N(class02102 var1) {
      return switch (this) {
         case field_40789 -> var1.method_25368();
         case field_40790 -> var1.method_25364();
      };
   }
}
