package minecraft;

import Nursultan.class10545;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import it.unimi.dsi.fastutil.floats.FloatComparators;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.DebugOptionsComparator;

@Environment(EnvType.CLIENT)
public class class05980 extends class06318<class05484> {
   private static final Comparator<Entry<class01894, class01285>> y = (var0, var1) -> {
      int i = FloatComparators.NATURAL_COMPARATOR.compare(var0.getValue().method_72759().y(), var1.getValue().method_72759().y());
      return i != 0 ? i : N(var0.getKey(), var1.getKey());
   };
   private static final int L = 20;

   private void L() {
      this.method_65506();
      this.N.method_37064(true);
   }

   public class05980(class04589 var1) {
      super(class06202.Nq(), var1.field_22789, var1.i.u(), var1.i.L(), 20);
      this.N = var1;
      this.N("");
   }

   public void y() {
      this.method_25396().forEach(class05484::N);
   }

   private boolean N(String var1, CharSequence var2, Operation var3, Entry var4) {
      String s = ((class01894)var4.getKey()).y();
      return (Boolean)var3.call(new Object[]{var1, var2}) || !"minecraft".equals(s) && s.contains(var2);
   }

   private static int N(class01894 var0, class01894 var1) {
      return DebugOptionsComparator.INSTANCE.compare(var0, var1);
   }

   private boolean N(String var1, CharSequence var2, Operation var3, LocalRef var4) {
      return this.N(var1, var2, var3, (Entry)var4.get());
   }

   public void N(String var1) {
      this.method_25339();
      ArrayList arraylist = new ArrayList<>(class06134.N().entrySet());
      arraylist.sort(y);
      class08944 class08944x = null;

      for (Entry entry : arraylist) {
         String s = ((class01894)entry.getKey()).N();
         Operation operation = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.lang.String, java.lang.CharSequence]");
            return ((String)var0[0]).contains((CharSequence)var0[1]);
         };
         LocalRefImpl localrefimpl = new LocalRefImpl();
         localrefimpl.init(entry);
         boolean flag = this.N(s, var1, operation, localrefimpl);
         entry = (Entry)localrefimpl.dispose();
         if (flag) {
            class08944 class08944x = ((class01285)entry.getValue()).method_72759();
            if (!class08944x.equals(class08944x)) {
               this.method_25321(new class01380(this.N, class08944x.N()));
               class08944x = class08944x;
            }

            this.method_25321(new class10545(this.N, (class01894)entry.getKey()));
         }
      }

      this.L();
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      super.method_48579(var1, var2, var3, var4);
   }

   @Override
   public int method_25322() {
      return 350;
   }
}
