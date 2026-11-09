package minecraft;

public abstract class class07874 extends class07475 {
   public static final int M = 120;

   public static boolean L(class07078<? extends class07874> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      int i = var1.method_8615();
      int j = i - 13;
      return var3.method_10264() >= j
         && var3.method_10264() <= i
         && var1.method_8316(var3.method_10074()).N(class01231.N)
         && var1.method_8320(var3.method_10084()).N(class00869.K);
   }

   @Override
   public boolean method_5675() {
      return false;
   }

   @Override
   public void method_5670() {
      int i = this.method_5669();
      super.method_5670();
      if (this.method_73183() instanceof class04782 class04782) {
         this.N(class04782, i);
      }
   }

   public class07874(class07078<? extends class07874> var1, class07299 var2) {
      super(var1, var2);
      this.N(class04425.field_18, 0.0F);
   }

   @Override
   public boolean g() {
      return false;
   }

   protected void N(class04782 var1, int var2) {
      if (this.method_5805() && !this.method_5799()) {
         this.method_5855(var2 - 1);
         if (this.method_74092()) {
            this.method_5855(0);
            this.method_64397(var1, this.method_48923().Z(), 2.0F);
         }
      } else {
         this.method_5855(300);
      }
   }

   @Override
   public boolean N(class05487 var1) {
      return var1.method_8606(this);
   }

   @Override
   public int m_() {
      return 120;
   }

   @Override
   public int method_6110(class04782 var1) {
      return 1 + this.field_5974.y(3);
   }
}
