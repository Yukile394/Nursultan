package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class07420(String jsonRpcProtocolVersion, class07414 discoverInfo, List<class07905<?, ?>> methods, class07422 components) {
   public static final MapCodec<class07420> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.STRING.fieldOf("openrpc").forGetter(class07420::N),
            class07414.N.codec().fieldOf("info").forGetter(class07420::y),
            Codec.list(class07905.N).fieldOf("methods").forGetter(class07420::L),
            class07422.N.codec().fieldOf("components").forGetter(class07420::u)
         )
         .apply(var0, class07420::new)
   );

   public List<class07905<?, ?>> L() {
      return this.methods;
   }

   public class07420(String jsonRpcProtocolVersion, class07414 discoverInfo, List<class07905<?, ?>> methods, class07422 components) {
      this.jsonRpcProtocolVersion = jsonRpcProtocolVersion;
      this.discoverInfo = discoverInfo;
      this.methods = methods;
      this.components = components;
   }

   public class07422 u() {
      return this.components;
   }

   public class07414 y() {
      return this.discoverInfo;
   }

   public String N() {
      return this.jsonRpcProtocolVersion;
   }
}
