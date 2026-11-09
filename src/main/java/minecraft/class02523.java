package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface class02523 {
   Codec<class02477<?>> N = Codec.lazyInitialized(() -> class04206.Nb.T());
   Codec<class02695> y = class02695.N(N);
   class02477<List<class02944<class02536>>> L = N("damage_protection", var0 -> var0.N(class02944.N(class02536.y, class06925.G).listOf()));
   class02477<List<class02944<class02557>>> u = N("damage_immunity", var0 -> var0.N(class02944.N(class02557.y, class06925.G).listOf()));
   class02477<List<class02944<class02536>>> i = N("damage", var0 -> var0.N(class02944.N(class02536.y, class06925.G).listOf()));
   class02477<List<class02944<class02536>>> R = N("smash_damage_per_fallen_block", var0 -> var0.N(class02944.N(class02536.y, class06925.G).listOf()));
   class02477<List<class02944<class02536>>> M = N("knockback", var0 -> var0.N(class02944.N(class02536.y, class06925.G).listOf()));
   class02477<List<class02944<class02536>>> B = N("armor_effectiveness", var0 -> var0.N(class02944.N(class02536.y, class06925.G).listOf()));
   class02477<List<class02550<class02560>>> Z = N("post_attack", var0 -> var0.N(class02550.N(class02560.y, class06925.G).listOf()));
   class02477<List<class02944<class02560>>> z = N("post_piercing_attack", var0 -> var0.N(class02944.N(class02560.y, class06925.G).listOf()));
   class02477<List<class02944<class02560>>> U = N("hit_block", var0 -> var0.N(class02944.N(class02560.y, class06925.k).listOf()));
   class02477<List<class02944<class02536>>> E = N("item_damage", var0 -> var0.N(class02944.N(class02536.y, class06925.l).listOf()));
   class02477<List<class02541>> W = N("attributes", var0 -> var0.N(class02541.N.codec().listOf()));
   class02477<List<class02550<class02536>>> m = N("equipment_drops", var0 -> var0.N(class02550.y(class02536.y, class06925.G).listOf()));
   class02477<List<class02944<class02548>>> P = N("location_changed", var0 -> var0.N(class02944.N(class02548.L, class06925.d).listOf()));
   class02477<List<class02944<class02560>>> s = N("tick", var0 -> var0.N(class02944.N(class02560.y, class06925.w).listOf()));
   class02477<List<class02944<class02536>>> T = N("ammo_use", var0 -> var0.N(class02944.N(class02536.y, class06925.l).listOf()));
   class02477<List<class02944<class02536>>> b = N("projectile_piercing", var0 -> var0.N(class02944.N(class02536.y, class06925.l).listOf()));
   class02477<List<class02944<class02560>>> j = N("projectile_spawned", var0 -> var0.N(class02944.N(class02560.y, class06925.w).listOf()));
   class02477<List<class02944<class02536>>> v = N("projectile_spread", var0 -> var0.N(class02944.N(class02536.y, class06925.w).listOf()));
   class02477<List<class02944<class02536>>> n = N("projectile_count", var0 -> var0.N(class02944.N(class02536.y, class06925.w).listOf()));
   class02477<List<class02944<class02536>>> t = N("trident_return_acceleration", var0 -> var0.N(class02944.N(class02536.y, class06925.w).listOf()));
   class02477<List<class02944<class02536>>> G = N("fishing_time_reduction", var0 -> var0.N(class02944.N(class02536.y, class06925.w).listOf()));
   class02477<List<class02944<class02536>>> l = N("fishing_luck_bonus", var0 -> var0.N(class02944.N(class02536.y, class06925.w).listOf()));
   class02477<List<class02944<class02536>>> d = N("block_experience", var0 -> var0.N(class02944.N(class02536.y, class06925.l).listOf()));
   class02477<List<class02944<class02536>>> w = N("mob_experience", var0 -> var0.N(class02944.N(class02536.y, class06925.w).listOf()));
   class02477<List<class02944<class02536>>> k = N("repair_with_xp", var0 -> var0.N(class02944.N(class02536.y, class06925.l).listOf()));
   class02477<class02536> Y = N("crossbow_charge_time", var0 -> var0.N(class02536.y));
   class02477<List<class06589>> Q = N("crossbow_charging_sounds", var0 -> var0.N(class06589.N.listOf()));
   class02477<List<class03556<class04891>>> O = N("trident_sound", var0 -> var0.N(class04891.y.listOf()));
   class02477<class06244> g = N("prevent_equipment_drop", var0 -> var0.N(class06244.field_51563));
   class02477<class06244> I = N("prevent_armor_change", var0 -> var0.N(class06244.field_51563));
   class02477<class02536> J = N("trident_spin_attack_strength", var0 -> var0.N(class02536.y));

   private static <T> class02477<T> N(String var0, UnaryOperator<class02472<T>> var1) {
      return class00751.N(class04206.Nb, var0, var1.apply(class02477.N()).y());
   }

   static class02477<?> N(class00751<class02477<?>> var0) {
      return L;
   }
}
