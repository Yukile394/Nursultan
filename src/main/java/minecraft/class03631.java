package minecraft;

import com.mojang.serialization.MapCodec;

public class class03631 {
   public static final MapCodec<class04558> N = N("lightning", class04558.N);
   public static final MapCodec<class01365> y = N("fishing_hook", class01365.y);
   public static final MapCodec<class01406> L = N("player", class01406.y);
   public static final MapCodec<class03638> u = N("slime", class03638.N);
   public static final MapCodec<class02640> i = N("raider", class02640.N);
   public static final MapCodec<class08219> R = N("sheep", class08219.N);

   public class03631() {
      super();
   }

   private static <T extends class03622> MapCodec<T> N(String var0, MapCodec<T> var1) {
      return class00751.N(class04206.NP, var0, var1);
   }

   public static MapCodec<? extends class03622> N(class00751<MapCodec<? extends class03622>> var0) {
      return N;
   }
}
