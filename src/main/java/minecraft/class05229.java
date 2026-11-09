package minecraft;

import Nursultan.class10502;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.gamerule.v1.FabricGameRuleVisitor;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;
import net.fabricmc.fabric.impl.gamerule.widget.DoubleRuleWidget;
import net.fabricmc.fabric.impl.gamerule.widget.EnumRuleWidget;

@Environment(EnvType.CLIENT)
class class05229 implements class05706, FabricGameRuleVisitor {
   @Override
   public void L(class06839<Integer> var1) {
      this.N(var1, (var1x, var2, var3, var4) -> new class05203(this.L.N, var1x, var2, var3, var4));
   }

   class05229(class05218 var1, class05191 var2, Map var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   @Override
   public void y(class06839<Boolean> var1) {
      this.N(var1, (var1x, var2, var3, var4) -> new class05206(this.L.N, var1x, var2, var3, var4));
   }

   private String N(class06839 var1, Object var2, Operation var3) {
      String s = (String)var3.call(new Object[]{var1, var2});
      if (var1.fabric_getType() != FabricGameRuleType.ENUM) {
         return s;
      } else {
         String s1 = var1.L() + "." + s.toLowerCase(Locale.ROOT);
         return class08392.N(s1) ? class08392.N(s1) : s;
      }
   }

   private <T> void N(class06839<T> var1, class10502<T> var2) {
      class05216 class05216xxx = class00392.L(var1.L());
      class05216 class05216x = class00392.y(var1.N()).N(class06541.field_1054);
      Object[] aobject = new Object[1];
      Object object = var1.Z();
      aobject[0] = class00392.y(this.N(var1, object, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_12279, java.lang.Object]");
         return ((class06839)var0[0]).N(var0[1]);
      }));
      class05216 class05216xx = class00392.N("editGamerule.default", aobject).N(class06541.field_1080);
      String s = var1.L() + ".description";
      ImmutableList immutablelist;
      String s1;
      if (class08392.N(s)) {
         Builder builder = ImmutableList.builder().add(class05216x.method_30937());
         class05216 class05216xxx = class00392.L(s);
         class05191.M(this.L.N).L(class05216xxx, 150).forEach(builder::add);
         immutablelist = builder.add(class05216xx.method_30937()).build();
         s1 = class05216xxx.getString() + "\n" + class05216xx.getString();
      } else {
         immutablelist = ImmutableList.of(class05216x.method_30937(), class05216xx.method_30937());
         s1 = class05216xx.getString();
      }

      this.y.computeIfAbsent(var1.i(), var0 -> Maps.newHashMap()).put(var1, var2.create(class05216xxx, immutablelist, s1, var1));
   }

   public void visitEnum(class06839 var1) {
      this.N(var1, (var2, var3, var4, var5) -> new EnumRuleWidget(this.N, var2, var3, var4, var5, var1.L()));
   }

   public void visitDouble(class06839 var1) {
      this.N(var1, (var1x, var2, var3, var4) -> new DoubleRuleWidget(this.N, var1x, var2, var3, var4));
   }
}
