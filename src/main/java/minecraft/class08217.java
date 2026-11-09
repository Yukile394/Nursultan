package minecraft;

import com.mojang.serialization.MapCodec;

public record class08217<T extends class08200>(MapCodec<T> codec, class02362<class04247, T> streamCodec) {
   public static final class08217<class08242> N = N("apply_effects", class08242.N, class08242.y);
   public static final class08217<class08211> y = N("remove_effects", class08211.N, class08211.y);
   public static final class08217<class08215> L = N("clear_all_effects", class08215.y, class08215.L);
   public static final class08217<class08235> u = N("teleport_randomly", class08235.N, class08235.y);
   public static final class08217<class08229> i = N("play_sound", class08229.N, class08229.y);

   public class08217(MapCodec<T> codec, class02362<class04247, T> streamCodec) {
      this.codec = codec;
      this.streamCodec = streamCodec;
   }

   public class02362<class04247, T> y() {
      return this.streamCodec;
   }

   public MapCodec<T> N() {
      return this.codec;
   }

   private static <T extends class08200> class08217<T> N(String var0, MapCodec<T> var1, class02362<class04247, T> var2) {
      return class00751.N(class04206.Nl, var0, new class08217<>(var1, var2));
   }
}
