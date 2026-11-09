package minecraft;

import Nursultan.class11647;
import java.util.Map;

public interface class08699 {
   class05946<? extends class00751<class11647>> N = class05946.N(class01894.y("equipment_asset"));
   class05946<class11647> y = N("leather");
   class05946<class11647> L = N("copper");
   class05946<class11647> u = N("chainmail");
   class05946<class11647> i = N("iron");
   class05946<class11647> R = N("gold");
   class05946<class11647> M = N("diamond");
   class05946<class11647> B = N("turtle_scute");
   class05946<class11647> Z = N("netherite");
   class05946<class11647> z = N("armadillo_scute");
   class05946<class11647> U = N("elytra");
   class05946<class11647> E = N("saddle");
   Map<class06563, class05946<class11647>> W = class07536.N_74(class06563.class, var0 -> N(var0.method_15434() + "_carpet"));
   class05946<class11647> m = N("trader_llama");
   Map<class06563, class05946<class11647>> P = class07536.N_74(class06563.class, var0 -> N(var0.method_15434() + "_harness"));

   static class05946<class11647> N(String var0) {
      return class05946.N(N, class01894.y(var0));
   }
}
