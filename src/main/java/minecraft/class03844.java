package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

record class03844(UUID id, String url, Instant time, Optional<String> hash, Either<String, class03812> errorOrFileInfo) {
   public static final Codec<class03844> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01487.u.fieldOf("id").forGetter(class03844::N),
            Codec.STRING.fieldOf("url").forGetter(class03844::y),
            class06338.l.fieldOf("time").forGetter(class03844::L),
            Codec.STRING.optionalFieldOf("hash").forGetter(class03844::u),
            Codec.mapEither(Codec.STRING.fieldOf("error"), class03812.N.fieldOf("file")).forGetter(class03844::i)
         )
         .apply(var0, class03844::new)
   );

   public Instant L() {
      return this.time;
   }

   class03844(UUID id, String url, Instant time, Optional<String> hash, Either<String, class03812> errorOrFileInfo) {
      this.id = id;
      this.url = url;
      this.time = time;
      this.hash = hash;
      this.errorOrFileInfo = errorOrFileInfo;
   }

   public Either<String, class03812> i() {
      return this.errorOrFileInfo;
   }

   public Optional<String> u() {
      return this.hash;
   }

   public String y() {
      return this.url;
   }

   public UUID N() {
      return this.id;
   }
}
