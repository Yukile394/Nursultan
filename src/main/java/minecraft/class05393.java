package minecraft;

class class05393 extends class05358 {
   final int N;

   public class05393(class05417 var1, int var2, int var3, int var4, class05361 var5) {
      super(var2, var3, 88, 20, class05220.N, var5, field_40754);
      this.y = var1;
      this.N = var4;
      this.field_22764 = false;
   }

   public int y() {
      return this.N;
   }

   public void N(class01054 var1, int var2, int var3) {
      if (this.field_22762 && this.y.m.s().size() > this.N + this.y.N) {
         if (var2 < this.method_46426() + 20) {
            class06584 class06584xx = this.y.m.s().get(this.N + this.y.N).y();
            var1.y(class05417.N(this.y), class06584xx, var2, var3);
         } else if (var2 < this.method_46426() + 50 && var2 > this.method_46426() + 30) {
            class06584 class06584 = this.y.m.s().get(this.N + this.y.N).L();
            if (!class06584.R()) {
               var1.y(class05417.y(this.y), class06584, var2, var3);
            }
         } else if (var2 > this.method_46426() + 65) {
            class06584 class06584x = this.y.m.s().get(this.N + this.y.N).R();
            var1.y(class05417.L(this.y), class06584x, var2, var3);
         }
      }
   }
}
