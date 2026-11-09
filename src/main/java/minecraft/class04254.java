package minecraft;

import java.util.Map;
import java.util.UUID;

public record class04254(Map<class01894, byte[]> cookies, Map<UUID, class03458> seenPlayers, boolean seenInsecureChatWarning) {
   public boolean L() {
      return this.seenInsecureChatWarning;
   }

   public class04254(Map<class01894, byte[]> cookies, Map<UUID, class03458> seenPlayers, boolean seenInsecureChatWarning) {
      this.cookies = cookies;
      this.seenPlayers = seenPlayers;
      this.seenInsecureChatWarning = seenInsecureChatWarning;
   }

   public Map<UUID, class03458> y() {
      return this.seenPlayers;
   }

   public Map<class01894, byte[]> N() {
      return this.cookies;
   }
}
