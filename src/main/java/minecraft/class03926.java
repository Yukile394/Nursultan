package minecraft;

import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public record class03926(class02083 link, class04469 signature, class03079 signedBody, class00392 unsignedContent, class03055 filterMask) {
   public static final MapCodec<class03926> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class02083.N.fieldOf("link").forGetter(class03926::U),
            ((Codec)class04469.y_0).optionalFieldOf("signature").forGetter(var0x -> Optional.ofNullable(var0x.signature)),
            class03079.N.forGetter(class03926::W),
            class03748.N.optionalFieldOf("unsigned_content").forGetter(var0x -> Optional.ofNullable(var0x.unsignedContent)),
            class03055.N.optionalFieldOf("filter_mask", class03055.L).forGetter(class03926::P)
         )
         .apply(var0, (var0x, var1, var2, var3, var4) -> new class03926(var0x, (class04469)var1.orElse(null), var2, (class00392)var3.orElse(null), var4))
   );
   private static final UUID Z = class07536.R;
   public static final Duration y = Duration.ofMinutes(5L);
   public static final Duration L = y.plus(Duration.ofMinutes(2L));

   public String L() {
      return this.signedBody.N();
   }

   public UUID M() {
      return this.link.L();
   }

   public class03055 P() {
      return this.filterMask;
   }

   public class03926(class02083 link, @Nullable class04469 signature, class03079 signedBody, @Nullable class00392 unsignedContent, class03055 filterMask) {
      this.link = link;
      this.signature = signature;
      this.signedBody = signedBody;
      this.unsignedContent = unsignedContent;
      this.filterMask = filterMask;
   }

   public boolean B() {
      return this.M().equals(Z);
   }

   public boolean Z() {
      return this.signature != null;
   }

   public Instant i() {
      return this.signedBody.y();
   }

   @Nullable
   public class00392 m() {
      return this.unsignedContent;
   }

   public class02083 U() {
      return this.link;
   }

   public boolean z() {
      return this.filterMask.y();
   }

   public class00392 u() {
      return Objects.requireNonNullElseGet(this.unsignedContent, () -> class00392.y(this.L()));
   }

   public class03926 y() {
      class03079 class03079 = class03079.N(this.L());
      class02083 class02083 = class02083.N(this.M());
      return new class03926(class02083, null, class03079, this.unsignedContent, this.filterMask);
   }

   public boolean y(Instant var1) {
      return var1.isAfter(this.i().plus(L));
   }

   @Nullable
   public class04469 E() {
      return this.signature;
   }

   public boolean N(UUID var1) {
      return this.Z() && this.link.L().equals(var1);
   }

   public static class03926 N(String var0) {
      return N(Z, var0);
   }

   public static class03926 N(UUID var0, String var1) {
      class03079 class03079 = class03079.N(var1);
      class02083 class02083 = class02083.N(var0);
      return new class03926(class02083, null, class03079, null, class03055.L);
   }

   public class03926 N() {
      return this.unsignedContent != null ? new class03926(this.link, this.signature, this.signedBody, null, this.filterMask) : this;
   }

   public static void N(class03934 var0, class02083 var1, class03079 var2) throws SignatureException {
      var0.update(Ints.toByteArray(1));
      var1.N(var0);
      var2.N(var0);
   }

   public class03926 N(class03055 var1) {
      return this.filterMask.equals(var1) ? this : new class03926(this.link, this.signature, this.signedBody, this.unsignedContent, var1);
   }

   public boolean N(class03962 var1) {
      return this.signature != null && this.signature.N(var1, var1x -> N(var1x, this.link, this.signedBody));
   }

   public boolean N(Instant var1) {
      return var1.isAfter(this.i().plus(y));
   }

   public class03926 N(boolean var1) {
      return this.N(var1 ? this.filterMask : class03055.L);
   }

   public class03926 N(class00392 var1) {
      class00392 class00392 = !var1.equals(class00392.y(this.L())) ? var1 : null;
      return new class03926(this.link, this.signature, this.signedBody, class00392, this.filterMask);
   }

   public static String N(class03926 var0) {
      return "'"
         + var0.signedBody.N()
         + "' @ "
         + var0.signedBody.y()
         + "\n - From: "
         + var0.link.L()
         + "/"
         + var0.link.u()
         + ", message #"
         + var0.link.y()
         + "\n - Salt: "
         + var0.signedBody.L()
         + "\n - Signature: "
         + class04469.N(var0.signature)
         + "\n - Last Seen: [\n"
         + var0.signedBody.u().y().stream().map(var0x -> "     " + class04469.N(var0x) + "\n").collect(Collectors.joining())
         + " ]\n";
   }

   public class03079 W() {
      return this.signedBody;
   }

   public long R() {
      return this.signedBody.L();
   }
}
