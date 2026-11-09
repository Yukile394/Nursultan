package minecraft;

import com.mojang.serialization.MapCodec;

public interface class06514<T extends class06521<?>> {
   class06514<class07329> y = N("crafting_shaped", new class07292());
   class06514<class06523> L = N("crafting_shapeless", new class07294());
   class06514<class06496> u = N("crafting_special_armordye", new class06522<>(class06496::new));
   class06514<class06490> i = N("crafting_special_bookcloning", new class06522<>(class06490::new));
   class06514<class06489> R = N("crafting_special_mapcloning", new class06522<>(class06489::new));
   class06514<class06487> M = N("crafting_special_mapextending", new class06522<>(class06487::new));
   class06514<class06491> B = N("crafting_special_firework_rocket", new class06522<>(class06491::new));
   class06514<class06503> Z = N("crafting_special_firework_star", new class06522<>(class06503::new));
   class06514<class06512> z = N("crafting_special_firework_star_fade", new class06522<>(class06512::new));
   class06514<class07283> U = N("crafting_special_tippedarrow", new class06522<>(class07283::new));
   class06514<class06498> E = N("crafting_special_bannerduplicate", new class06522<>(class06498::new));
   class06514<class07325> W = N("crafting_special_shielddecoration", new class06522<>(class07325::new));
   class06514<class08690> m = N("crafting_transmute", new class08686());
   class06514<class05721> P = N("crafting_special_repairitem", new class06522<>(class05721::new));
   class06514<class05654> s = N("smelting", new class07298<>(class05654::new, 200));
   class06514<class05641> T = N("blasting", new class07298<>(class05641::new, 100));
   class06514<class05636> b = N("smoking", new class07298<>(class05636::new, 100));
   class06514<class05869> j = N("campfire_cooking", new class07298<>(class05869::new, 100));
   class06514<class06156> v = N("stonecutting", new class06154<>(class06156::new));
   class06514<class03280> n = N("smithing_transform", new class03248());
   class06514<class03259> t = N("smithing_trim", new class03268());
   class06514<class01946> G = N("crafting_decorated_pot", new class06522<>(class01946::new));

   @Deprecated
   class02362<class04247, T> y();

   MapCodec<T> N();

   static <S extends class06514<T>, T extends class06521<?>> S N(String var0, S var1) {
      return class00751.N(class04206.j, var0, (S)var1);
   }
}
