package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00629(class04475 chat, class04475 narration) {
   public static final Codec<class00629> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            ((Codec)class04475.u_0).fieldOf("chat").forGetter(class00629::N), ((Codec)class04475.u_0).fieldOf("narration").forGetter(class00629::y)
         )
         .apply(var0, class00629::new)
   );
   public static final class02362<class04247, class00629> y = class02362.N(class02389.s, class00629::N, class02389.s, class00629::y, class00629::new);
   public static final class02362<class04247, class03556<class00629>> L = class02389.N(class04227.NC, y);
   public static final class04475 u = class04475.L("chat.type.text");
   public static final class05946<class00629> i = N("chat");
   public static final class05946<class00629> R = N("say_command");
   public static final class05946<class00629> M = N("msg_command_incoming");
   public static final class05946<class00629> B = N("msg_command_outgoing");
   public static final class05946<class00629> Z = N("team_msg_command_incoming");
   public static final class05946<class00629> z = N("team_msg_command_outgoing");
   public static final class05946<class00629> U = N("emote_command");

   public class00629(class04475 chat, class04475 narration) {
      this.chat = chat;
      this.narration = narration;
   }

   public class04475 y() {
      return this.narration;
   }

   public class04475 N() {
      return this.chat;
   }

   public static void N(class04116<class00629> var0) {
      var0.N(i, new class00629(u, class04475.y("chat.type.text.narrate")));
      var0.N(R, new class00629(class04475.y("chat.type.announcement"), class04475.y("chat.type.text.narrate")));
      var0.N(M, new class00629(class04475.N("commands.message.display.incoming"), class04475.y("chat.type.text.narrate")));
      var0.N(B, new class00629(class04475.u("commands.message.display.outgoing"), class04475.y("chat.type.text.narrate")));
      var0.N(Z, new class00629(class04475.L("chat.type.team.text"), class04475.y("chat.type.text.narrate")));
      var0.N(z, new class00629(class04475.L("chat.type.team.sent"), class04475.y("chat.type.text.narrate")));
      var0.N(U, new class00629(class04475.y("chat.type.emote"), class04475.y("chat.type.emote")));
   }

   public static class00649 N(class05946<class00629> var0, class01042 var1, class00392 var2) {
      class00751 class00751 = var1.L(class04227.NC);
      return new class00649(class00751.y(var0), var2);
   }

   private static class05946<class00629> N(String var0) {
      return class05946.N(class04227.NC, class01894.y(var0));
   }

   public static class00649 N(class05946<class00629> var0, class07701 var1) {
      return N(var0, var1.t(), var1.L());
   }

   public static class00649 N(class05946<class00629> var0, class07049 var1) {
      return N(var0, var1.method_73183().method_30349(), var1.method_5476());
   }
}
