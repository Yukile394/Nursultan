package minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.fabricmc.fabric.impl.item.EnchantmentUtil.BuilderExtensions;
import net.fabricmc.fabric.mixin.item.EnchantmentBuilderAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07301 implements BuilderExtensions, EnchantmentBuilderAccessor {
   private final class07286 N;
   private class03543<class07304> y;
   private final Map<class02477<?>, List<?>> L;
   private final class02676 u;
   private boolean i = false;

   public class07301(class07286 var1) {
      super();
      this.y = class03543.N();
      this.L = new HashMap<>();
      this.u = class02695.N();
      this.N = var1;
   }

   public <E> class07301 y(class02477<E> var1, E var2) {
      this.u.N(var1, var2);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, this);
      this.N(callbackinforeturnable);
      return this;
   }

   private <E> List<E> y(class02477<List<E>> var1) {
      List<?> list;
      List list1 = list = this.L.computeIfAbsent(var1, var2x -> {
         ArrayList arraylist = new ArrayList();
         this.u.N(var1, arraylist);
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", false, arraylist);
         this.N(callbackinforeturnable1);
         return arraylist;
      });
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, list);
      this.N(callbackinforeturnable);
      return list1;
   }

   public <E> class07301 N(class02477<List<class02944<E>>> var1, E var2, class05952 var3) {
      this.<class02944<Object>>y(var1).add(new class02944<>(var2, Optional.of(var3.build())));
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, this);
      this.N(callbackinforeturnable);
      return this;
   }

   public class07304 N(class01894 var1) {
      class07304 class07304x;
      class07304 class07304x = class07304x = new class07304(class00392.L(class07536.N("enchantment", var1)), this.N, this.y, this.u.N());
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, class07304x);
      this.N(callbackinforeturnable);
      return class07304x;
   }

   private void N(CallbackInfoReturnable var1) {
      if (var1.getReturnValue() == this) {
         this.i = true;
      }
   }

   public class07301 N(class03543<class07304> var1) {
      this.y = var1;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, this);
      this.N(callbackinforeturnable);
      return this;
   }

   public <E> class07301 N(class02477<List<class02550<E>>> var1, class02558 var2, class02558 var3, E var4, class05952 var5) {
      this.<class02550<Object>>y(var1).add(new class02550<>(var2, var3, var4, Optional.of(var5.build())));
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, this);
      this.N(callbackinforeturnable);
      return this;
   }

   public <E> class07301 N(class02477<List<class02550<E>>> var1, class02558 var2, class02558 var3, E var4) {
      this.<class02550<Object>>y(var1).add(new class02550<>(var2, var3, var4, Optional.empty()));
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, this);
      this.N(callbackinforeturnable);
      return this;
   }

   public class07301 N(class02477<List<class02541>> var1, class02541 var2) {
      this.<class02541>y(var1).add(var2);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, this);
      this.N(callbackinforeturnable);
      return this;
   }

   public <E> class07301 N(class02477<List<class02944<E>>> var1, E var2) {
      this.<class02944<Object>>y(var1).add(new class02944<>(var2, Optional.empty()));
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, this);
      this.N(callbackinforeturnable);
      return this;
   }

   public class07301 N(class02477<class06244> var1) {
      this.u.N(var1, class06244.field_17274);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, this);
      this.N(callbackinforeturnable);
      return this;
   }

   public boolean fabric$didModify() {
      return this.i;
   }

   public void fabric$resetModified() {
      this.i = false;
   }
}
