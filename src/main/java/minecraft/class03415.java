package minecraft;

import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ClientInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.RealmInfo;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest.ThirdPartyServerInfo;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public record class03415(String clientVersion, class03405 server) {
   @Nullable
   public ThirdPartyServerInfo L() {
      return this.server instanceof class03388 class03388 ? new ThirdPartyServerInfo(class03388.N()) : null;
   }

   private static String M() {
      StringBuilder stringbuilder = new StringBuilder();
      stringbuilder.append(class07529.y().comp_4024());
      if (class06202.Z().N()) {
         stringbuilder.append(" (modded)");
      }

      return stringbuilder.toString();
   }

   public class03415(String clientVersion, @Nullable class03405 server) {
      this.clientVersion = clientVersion;
      this.server = server;
   }

   public String i() {
      return this.clientVersion;
   }

   @Nullable
   public RealmInfo u() {
      return this.server instanceof class03395 class03395 ? new RealmInfo(String.valueOf(class03395.N()), class03395.y()) : null;
   }

   public ClientInfo y() {
      return new ClientInfo(this.clientVersion, Locale.getDefault().toLanguageTag());
   }

   public static class03415 N() {
      return N(null);
   }

   public static class03415 N(String var0) {
      return N(new class03388(var0));
   }

   public static class03415 N(class04981 var0) {
      return N(new class03395(var0));
   }

   public static class03415 N(@Nullable class03405 var0) {
      return new class03415(M(), var0);
   }

   @Nullable
   public class03405 R() {
      return this.server;
   }
}
