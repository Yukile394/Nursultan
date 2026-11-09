package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class07806(
   class00392 description, Optional<class07837> players, Optional<class07808> version, Optional<class07824> favicon, boolean enforcesSecureChat
) {
   public static final Codec<class07806> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03748.N.lenientOptionalFieldOf("description", class05220.N).forGetter(class07806::N),
            class07837.N.lenientOptionalFieldOf("players").forGetter(class07806::y),
            class07808.N.lenientOptionalFieldOf("version").forGetter(class07806::L),
            class07824.N.lenientOptionalFieldOf("favicon").forGetter(class07806::u),
            Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(class07806::i)
         )
         .apply(var0, class07806::new)
   );

   public Optional<class07808> L() {
      return this.version;
   }

   public class07806(
      class00392 description, Optional<class07837> players, Optional<class07808> version, Optional<class07824> favicon, boolean enforcesSecureChat
   ) {
      super();
      this.description = description;
      this.players = players;
      this.version = version;
      this.favicon = favicon;
      this.enforcesSecureChat = enforcesSecureChat;
   }

   public boolean i() {
      return this.enforcesSecureChat;
   }

   public Optional<class07824> u() {
      return this.favicon;
   }

   public Optional<class07837> y() {
      return this.players;
   }

   public class00392 N() {
      return this.description;
   }
}
