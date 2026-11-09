package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;

public record class02677(Optional<String> name, Optional<UUID> id, PropertyMap properties) {
   public static final class02677 u = new class02677(Optional.empty(), Optional.empty(), PropertyMap.EMPTY);
   static final MapCodec<class02677> i = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06338.K.optionalFieldOf("name").forGetter(class02677::N),
            class01487.N.optionalFieldOf("id").forGetter(class02677::y),
            class06338.q.optionalFieldOf("properties", PropertyMap.EMPTY).forGetter(class02677::L)
         )
         .apply(var0, class02677::new)
   );
   public static final class02362<ByteBuf, class02677> R = class02362.N(
      class02389.w.N_33(class02389::N), class02677::N, class01487.M.N_33(class02389::N), class02677::y, class02389.d, class02677::L, class02677::new
   );

   public PropertyMap L() {
      return this.properties;
   }

   protected class02677(Optional<String> name, Optional<UUID> id, PropertyMap properties) {
      this.name = name;
      this.id = id;
      this.properties = properties;
   }

   public GameProfile u() {
      return class02689.N(this.name, this.id, this.properties);
   }

   public Optional<UUID> y() {
      return this.id;
   }

   public Optional<String> N() {
      return this.name;
   }
}
