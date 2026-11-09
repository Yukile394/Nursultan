package minecraft;

import java.util.List;

class class05090 extends Thread {
   class05090(class05094 var1, String var2) {
      super(var2);
      this.N = var1;
   }

   @Override
   public void run() {
      class05111 class05111 = class05111.N();

      try {
         List<class04948> list = class05111.u(this.N.z.y).N();
         class05094.N(this.N).execute(() -> {
            this.N.R = list;
            this.N.U = this.N.R.isEmpty();
            if (!this.N.U && this.N.Z != null) {
               this.N.Z.field_22763 = true;
            }

            if (this.N.M != null) {
               this.N.M.method_25314(this.N.R.stream().map(var1xx -> new class05091(this.N, var1xx)).toList());
            }
         });
      } catch (class05097 class05097) {
         class05094.N.error("Couldn't request backups", class05097);
      }
   }
}
