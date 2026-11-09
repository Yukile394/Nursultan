package minecraft;

import com.mojang.authlib.GameProfile;
import java.util.Map;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public record class01892(
   class05384 levelLoadTracker,
   GameProfile localGameProfile,
   class02090 telemetryManager,
   class01022 receivedRegistries,
   class03767 enabledFeatures,
   String serverBrand,
   class04568 serverData,
   class05096 postDisconnectScreen,
   Map<class01894, byte[]> serverCookies,
   class06467 chatState,
   Map<String, String> customReportDetails,
   class02243 serverLinks,
   Map<UUID, class03458> seenPlayers,
   boolean seenInsecureChatWarning
) {
   public class02090 L() {
      return this.telemetryManager;
   }

   @Nullable
   public class04568 M() {
      return this.serverData;
   }

   public class01892(
      class05384 levelLoadTracker,
      GameProfile localGameProfile,
      class02090 telemetryManager,
      class01022 receivedRegistries,
      class03767 enabledFeatures,
      @Nullable String serverBrand,
      @Nullable class04568 serverData,
      @Nullable class05096 postDisconnectScreen,
      Map<class01894, byte[]> serverCookies,
      @Nullable class06467 chatState,
      Map<String, String> customReportDetails,
      class02243 serverLinks,
      Map<UUID, class03458> seenPlayers,
      boolean seenInsecureChatWarning
   ) {
      super();
      this.levelLoadTracker = levelLoadTracker;
      this.localGameProfile = localGameProfile;
      this.telemetryManager = telemetryManager;
      this.receivedRegistries = receivedRegistries;
      this.enabledFeatures = enabledFeatures;
      this.serverBrand = serverBrand;
      this.serverData = serverData;
      this.postDisconnectScreen = postDisconnectScreen;
      this.serverCookies = serverCookies;
      this.chatState = chatState;
      this.customReportDetails = customReportDetails;
      this.serverLinks = serverLinks;
      this.seenPlayers = seenPlayers;
      this.seenInsecureChatWarning = seenInsecureChatWarning;
   }

   @Nullable
   public class05096 B() {
      return this.postDisconnectScreen;
   }

   public Map<class01894, byte[]> Z() {
      return this.serverCookies;
   }

   public class03767 i() {
      return this.enabledFeatures;
   }

   public boolean m() {
      return this.seenInsecureChatWarning;
   }

   public Map<String, String> U() {
      return this.customReportDetails;
   }

   @Nullable
   public class06467 z() {
      return this.chatState;
   }

   public class01022 u() {
      return this.receivedRegistries;
   }

   public GameProfile y() {
      return this.localGameProfile;
   }

   public class02243 E() {
      return this.serverLinks;
   }

   public class05384 N() {
      return this.levelLoadTracker;
   }

   public Map<UUID, class03458> W() {
      return this.seenPlayers;
   }

   @Nullable
   public String R() {
      return this.serverBrand;
   }
}
