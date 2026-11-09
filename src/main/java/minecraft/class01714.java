package minecraft;

import Nursultan.class09516;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import net.fabricmc.fabric.impl.entity.event.effect.EffectEventContextImpl;
import net.fabricmc.fabric.impl.entity.event.effect.MobEffectUtil;

public record class01714<T>(class03099 frame, class01742<T> action) {
   public class01714(class03099 frame, class01742<T> action) {
      this.frame = frame;
      this.action = action;
   }

   private void y(class01752 var1) {
      this.action.execute(var1, this.frame);
   }

   public class01742<T> y() {
      return this.action;
   }

   private void N(class01752 var1, Operation var2) {
      if (this.action instanceof class09516 class09516) {
         if (((ParsedCommandNode)class09516.getCommand().getTopContext().getNodes().getFirst()).getNode() instanceof LiteralCommandNode literalcommandnode) {
            try {
               MobEffectUtil.pushContext(new EffectEventContextImpl(true, literalcommandnode.getName()));
               var2.call(new Object[]{var1});
            } finally {
               MobEffectUtil.popContext();
            }
         } else {
            var2.call(new Object[]{var1});
         }
      } else {
         var2.call(new Object[]{var1});
      }
   }

   public class03099 N() {
      return this.frame;
   }

   public void N(class01752<T> var1) {
      this.N(var1, var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 1, "[net.minecraft.class_8854]");
         this.y((class01752)var1x[0]);
         return (Void)null;
      });
   }
}
