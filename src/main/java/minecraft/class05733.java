package minecraft;

import com.viaversion.viafabricplus.injection.access.base.bedrock.IConfirmScreen;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import org.jspecify.annotations.Nullable;

public class class05733 extends class05096 implements IConfirmScreen {
   private final class00392 field_2401;
   protected class01885 field_61001 = class01885.u().N(8);
   protected class00392 field_2402;
   protected class00392 field_2399;
   @Nullable
   protected class05362 field_61002;
   @Nullable
   protected class05362 field_61003;
   private int field_2400;
   protected final BooleanConsumer field_2403;

   public class05733(BooleanConsumer var1, class00392 var2, class00392 var3) {
      this(var1, var2, var3, class05220.R, class05220.M);
   }

   public class05733(BooleanConsumer var1, class00392 var2, class00392 var3, class00392 var4, class00392 var5) {
      super(var2);
      this.field_2403 = var1;
      this.field_2401 = var3;
      this.field_2402 = var4;
      this.field_2399 = var5;
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.field_61001.L().y();
      this.field_61001.N(new class02071(this.field_22785, this.field_22793));
      this.field_61001.N(new class04230(this.field_2401, this.field_22793).N(this.field_22789 - 50).y(15).N(true));
      this.method_72128();
      class01885 class01885 = this.field_61001.N(class01885.i().N(4));
      class01885.L().L(16);
      this.method_37051(class01885);
      this.field_61001.method_48206(this::method_37063);
      this.method_48640();
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (this.field_2400 <= 0 && var1.v() == 256) {
         this.field_2403.accept(false);
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public void method_48640() {
      this.field_61001.N();
      class02077.N(this.field_61001, this.method_48202());
   }

   @Override
   public void method_25393() {
      super.method_25393();
      if (--this.field_2400 == 0) {
         this.field_61002.field_22763 = true;
         this.field_61003.field_22763 = true;
      }
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(super.method_25435(), this.field_2401);
   }

   protected void method_37051(class01885 var1) {
      this.field_61002 = var1.N(class05362.method_46430(this.field_2402, var1x -> this.field_2403.accept(true)).N());
      this.field_61003 = var1.N(class05362.method_46430(this.field_2399, var1x -> this.field_2403.accept(false)).N());
   }

   protected void method_72128() {
   }

   public void method_2125(int var1) {
      this.field_2400 = var1;
      this.field_61002.field_22763 = false;
      this.field_61003.field_22763 = false;
   }

   public void viaFabricPlus$updateMessage(class00392 var1) {
      for (class04654 class04654 : this.method_25396()) {
         if (class04654 instanceof class04230) {
            ((class04230)class04654).method_25355(var1);
            this.method_48640();
         }
      }
   }
}
