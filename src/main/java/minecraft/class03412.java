package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public record class03412(GameProfile profile, class03926 message, class03086 trustLevel) implements class03387 {
   public static final MapCodec<class03412> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06338.V.fieldOf("profile").forGetter(class03412::R),
            class03926.N.forGetter(class03412::M),
            class03086.field_40801.optionalFieldOf("trust_level", class03086.field_39780).forGetter(class03412::B)
         )
         .apply(var0, class03412::new)
   );
   private static final DateTimeFormatter R = class07536.N(FormatStyle.SHORT);

   public class00392 L() {
      class00392 class00392 = this.Z();
      return class00392.N("gui.chatSelection.heading", this.profile.name(), class00392);
   }

   public class03926 M() {
      return this.message;
   }

   public class03412(GameProfile profile, class03926 message, class03086 trustLevel) {
      this.profile = profile;
      this.message = message;
      this.trustLevel = trustLevel;
   }

   public class03086 B() {
      return this.trustLevel;
   }

   private class00392 Z() {
      return class00392.y(ZonedDateTime.ofInstant(this.message.i(), ZoneId.systemDefault()).format(R)).N(class06541.field_1056, class06541.field_1080);
   }

   @Override
   public class03075 i() {
      return class03075.field_40804;
   }

   public UUID u() {
      return this.profile.id();
   }

   @Override
   public class00392 y() {
      class00392 class00392x = this.N();
      class00392 class00392x = this.Z();
      return class00392.N("gui.chatSelection.message.narrate", this.profile.name(), class00392x, class00392x);
   }

   @Override
   public boolean N(UUID var1) {
      return this.message.N(var1);
   }

   @Override
   public class00392 N() {
      if (!this.message.P().N()) {
         class00392 class00392 = this.message.P().y(this.message.L());
         return (class00392)(class00392 != null ? class00392 : class00392.i());
      } else {
         return this.message.u();
      }
   }

   public GameProfile R() {
      return this.profile;
   }
}
