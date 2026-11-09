package minecraft;

public class class07450 extends class07442 {
   private final int N;
   private static final int Z = 10;
   private static final int z = 20;

   public class07450(class07079 var1, int var2) {
      super(var1);
      this.N = var2;
   }

   @Override
   public void N() {
      if (this.i > 0) {
         this.i--;
         this.Z()
            .ifPresent(
               var1x -> this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = this.N(this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2, var1x + 20.0F, this.L)
            );
         this.B().ifPresent(var1x -> this.y.method_36457(this.N(this.y.method_36455(), var1x + 10.0F, this.u)));
      } else {
         if (this.y.f().U()) {
            this.y.method_36457(this.N(this.y.method_36455(), 0.0F, 5.0F));
         }

         this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = this.N(
            this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2, this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0, this.L
         );
      }

      float f = class04995.R(this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2 - this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0);
      if (f < -this.N) {
         this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0 - 4.0F;
      } else if (f > this.N) {
         this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0 + 4.0F;
      }
   }
}
