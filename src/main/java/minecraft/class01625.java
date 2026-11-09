package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.yggdrasil.ProfileResult;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

class class01625 extends Thread {
   class01625(class01610 var1, String var2, String var3) {
      super(var2);
      this.y = var1;
      this.N = var3;
   }

   @Override
   public void run() {
      String s = Objects.requireNonNull(this.y.i, "Player name not initialized");

      try {
         ProfileResult profileresult = this.y.y.Nf().L().hasJoinedServer(s, this.N, this.N());
         if (profileresult != null) {
            GameProfile gameprofile = profileresult.profile();
            class01610.N.info("UUID of player {} is {}", gameprofile.name(), gameprofile.id());
            this.y.u.y();
            this.y.N(gameprofile);
         } else if (this.y.y.No()) {
            class01610.N.warn("Failed to verify username but will let them in anyway!");
            this.y.N(class01487.y(s));
         } else {
            this.y.N(class00392.L("multiplayer.disconnect.unverified_username"));
            class01610.N.error("Username '{}' tried to join with an invalid session", s);
         }
      } catch (AuthenticationUnavailableException authenticationunavailableexception) {
         if (this.y.y.No()) {
            class01610.N.warn("Authentication servers are down but will let them in anyway!");
            this.y.N(class01487.y(s));
         } else {
            this.y.N(class00392.L("multiplayer.disconnect.authservers_down"));
            class01610.N.error("Couldn't verify username because servers are unavailable");
         }
      }
   }

   @Nullable
   private InetAddress N() {
      SocketAddress socketaddress = this.y.L.method_10755();
      return this.y.y.Nc() && socketaddress instanceof InetSocketAddress ? ((InetSocketAddress)socketaddress).getAddress() : null;
   }
}
