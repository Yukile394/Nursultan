package minecraft;

public class class03376 extends class05699<class03376> {
   final class03380 N;

   public class03376(class03392 var1, class03380 var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public class03380 N() {
      return this.N;
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      this.y.method_25313(this);
      return super.method_25402(var1, var2);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int i = this.method_73380() + 1;
      int j = this.method_73382() + (this.method_73384() - 9) / 2 + 1;
      var1.y(class03418.y(this.y.N), this.N.y(), i, j, -1);
   }

   @Override
   public class00392 method_37006() {
      return class00392.N("gui.abuseReport.reason.narration", this.N.y(), this.N.L());
   }
}
