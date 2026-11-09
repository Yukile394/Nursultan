package minecraft;

public class class06991 extends class06968<class00465> {
   public class06991() {
      super(class00429.Z);
   }

   public void y(class04782 var1, class07209 var2) {
      this.N(var1, new class07321(var2), new class00437(var2, this.N.N(var1.method_19494().u(var2))));
   }

   @Override
   protected void y(class04770 var1, class07321 var2) {
      var1.method_51469()
         .method_19494()
         .N(var0 -> true, var2, class05372.field_18489)
         .forEach(var2x -> var1.field_13987.method_14364(new class00437(var2x.M(), this.N.N(new class00465(var2x)))));
   }

   public void N(class04782 var1, class07209 var2) {
      this.N(var1, new class07321(var2), new class00437(var2, this.N.N()));
   }

   public void N(class04782 var1, class05377 var2) {
      this.N(var1, new class07321(var2.M()), new class00437(var2.M(), this.N.N(new class00465(var2))));
   }
}
