package minecraft;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public record class06669(
   UUID profileId,
   GameProfile profile,
   boolean listed,
   int latency,
   class07282 gameMode,
   class00392 displayName,
   boolean showHat,
   int listOrder,
   class02048 chatSession
) {

   public boolean L() {
      return this.listed;
   }

   public boolean M() {
      return this.showHat;
   }

   class06669(class04770 var1) {
      this(
         var1.method_5667(),
         var1.method_7334(),
         true,
         var1.field_13987.method_52405(),
         var1.method_68876(),
         var1.method_14206(),
         var1.method_74091(class08030.field_7563),
         var1.method_61272(),
         class01962.N(var1.method_45163(), class02027::N)
      );
   }

   public class06669(
      UUID profileId,
      @Nullable GameProfile profile,
      boolean listed,
      int latency,
      class07282 gameMode,
      @Nullable class00392 displayName,
      boolean showHat,
      int listOrder,
      @Nullable class02048 chatSession
   ) {
      this.profileId = profileId;
      this.profile = profile;
      this.listed = listed;
      this.latency = latency;
      this.gameMode = gameMode;
      this.displayName = displayName;
      this.showHat = showHat;
      this.listOrder = listOrder;
      this.chatSession = chatSession;
   }

   public int B() {
      return this.listOrder;
   }

   @Nullable
   public class02048 Z() {
      return this.chatSession;
   }

   public class07282 i() {
      return this.gameMode;
   }

   public int u() {
      return this.latency;
   }

   @Nullable
   public GameProfile y() {
      return this.profile;
   }

   public UUID N() {
      return this.profileId;
   }

   @Nullable
   public class00392 R() {
      return this.displayName;
   }
}
