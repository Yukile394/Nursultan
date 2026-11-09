package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08418 implements class08400 {
   private static final class08397[] y = class08397.values();
   private static final int L = -1;
   private Set<class08397> u;
   private Map<class08397, List<Consumer<class07049>>> i;
   private Map<class08397, List<Consumer<class07049>>> R;
   private List<Consumer<class07049>> M;
   private int B;

   private Object L(Map var1, Object var2, Operation var3) {
      if (var1 == null) {
         this.R = new EnumMap<>(class08397.class);
         var1 = this.R;
      }

      return var1.computeIfAbsent((class08397)var2, var0 -> new ArrayList<>());
   }

   private boolean L(List var1) {
      return var1 != null;
   }

   public class08418() {
      super();
      Class<class08397> oclass = class08397.class;
      this.u = this.N(oclass, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[java.lang.Class]");
         return EnumSet.noneOf((Class)var0[0]);
      });
      Function function = var0 -> new ArrayList();
      oclass = class08397.class;
      this.i = this.N(oclass, function, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.lang.Class, java.util.function.Function]");
         return class07536.N_74((Class)var0[0], (Function)var0[1]);
      });
      function = var0 -> new ArrayList();
      oclass = class08397.class;
      this.R = this.N(oclass, function, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.lang.Class, java.util.function.Function]");
         return class07536.N_74((Class)var0[0], (Function)var0[1]);
      });
      ArrayList arraylist = this.N((Operation)(var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 0, "[]");
         return new ArrayList();
      }));
      Object object1 = null;
      Object object = null;
      this.M = arraylist;
      this.B = -1;
   }

   @Override
   public void y(class08397 var1, Consumer<class07049> var2) {
      Map<class08397, List<Consumer<class07049>>> map = this.R;
      ((List)this.L(map, var1, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.util.Map, java.lang.Object]");
         return ((Map)var0[0]).get(var0[1]);
      })).add(var2);
   }

   private Object y(Map var1, Object var2, Operation var3) {
      if (var1 == null) {
         this.i = new EnumMap<>(class08397.class);
         var1 = this.i;
      }

      return var1.computeIfAbsent((class08397)var2, var0 -> new ArrayList<>());
   }

   private boolean y(List var1) {
      return var1 != null;
   }

   @Override
   public void N(class08397 var1, Consumer<class07049> var2) {
      Map<class08397, List<Consumer<class07049>>> map = this.i;
      ((List)this.y(map, var1, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.util.Map, java.lang.Object]");
         return ((Map)var0[0]).get(var0[1]);
      })).add(var2);
   }

   public void N(int var1) {
      if (this.B != var1) {
         this.B = var1;
         this.N();
      }
   }

   public void N(class07049 var1) {
      this.N();
      List<Consumer<class07049>> list = this.M;

      for (Consumer consumer : this.N(list)) {
         if (!var1.method_5805()) {
            break;
         }

         consumer.accept(var1);
      }

      list = this.M;
      if (this.y(list)) {
         list.clear();
      }

      this.B = -1;
   }

   private void N() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         for (class08397 class08397 : y) {
            Map map = this.i;
            List list = (List)this.N(map, class08397, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.util.Map, java.lang.Object]");
               return ((Map)var0[0]).get(var0[1]);
            });
            List list2 = this.M;
            this.N(list2, list, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.util.List, java.util.Collection]");
               return ((List)var0[0]).addAll((Collection)var0[1]);
            });
            if (this.L(list)) {
               list.clear();
            }

            Set set = this.u;
            if (this.N(set, class08397, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.util.Set, java.lang.Object]");
               return ((Set)var0[0]).remove(var0[1]);
            })) {
               this.M.add(class08397.N());
            }

            map = this.R;
            List list1 = (List)this.N(map, class08397, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.util.Map, java.lang.Object]");
               return ((Map)var0[0]).get(var0[1]);
            });
            List list3 = this.M;
            this.N(list3, list1, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 2, "[java.util.List, java.util.Collection]");
               return ((List)var0[0]).addAll((Collection)var0[1]);
            });
            if (this.L(list1)) {
               list1.clear();
            }
         }
      }
   }

   @Override
   public void N(class08397 var1) {
      this.N(var1, null);
      this.u.add(var1);
   }

   private boolean N(Set var1, Object var2, Operation var3) {
      return var1 == null ? false : (Boolean)var3.call(new Object[]{var1, var2});
   }

   private void N(CallbackInfo var1) {
      if (this.u != null && !this.u.isEmpty() || this.i != null && !this.i.isEmpty() || this.R != null && !this.R.isEmpty()) {
         if (this.M == null) {
            this.M = new ArrayList<>();
         }
      } else {
         var1.cancel();
      }
   }

   private List N(List var1) {
      return var1 == null ? Collections.emptyList() : var1;
   }

   private ArrayList N(Operation var1) {
      return null;
   }

   private EnumSet N(Class var1, Operation var2) {
      return null;
   }

   private Map<class08397, List<Consumer<class07049>>> N(Class var1, Function var2, Operation var3) {
      return null;
   }

   private void N(class08397 var1, CallbackInfo var2) {
      if (this.u == null) {
         this.u = EnumSet.noneOf(class08397.class);
      }
   }

   private Object N(Map var1, Object var2, Operation var3) {
      return var1 == null ? null : var3.call(new Object[]{var1, var2});
   }

   private boolean N(List var1, Collection var2, Operation var3) {
      return var2 != null && !var2.isEmpty() ? (Boolean)var3.call(new Object[]{var1, var2}) : false;
   }
}
