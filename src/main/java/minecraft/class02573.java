package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.microsoft.aad.msal4j.ClientCredentialFactory;
import com.microsoft.aad.msal4j.ClientCredentialParameters;
import com.microsoft.aad.msal4j.ConfidentialClientApplication;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import com.microsoft.aad.msal4j.IClientCertificate;
import com.microsoft.aad.msal4j.ConfidentialClientApplication.Builder;
import com.mojang.authlib.GameProfile;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.jspecify.annotations.Nullable;

public class class02573 extends class02593 {
   private final ConfidentialClientApplication N;
   private final ClientCredentialParameters y;
   private final Set<String> L;
   private final int u;

   private class02573(
      URL var1,
      class02571 var2,
      class02588 var3,
      ExecutorService var4,
      ConfidentialClientApplication var5,
      ClientCredentialParameters var6,
      Set<String> var7,
      int var8
   ) {
      super(var1, var2, var3, var4);
      this.N = var5;
      this.y = var6;
      this.L = var7;
      this.u = var8;
   }

   private IAuthenticationResult y() {
      return (IAuthenticationResult)this.N.acquireToken(this.y).join();
   }

   @Override
   protected int N() {
      return this.u;
   }

   @Override
   protected class06068 N(String var1, class02588 var2, JsonObject var3) {
      JsonObject jsonobject = class05001.N(var3, "result", null);
      if (jsonobject == null) {
         return class06068.y(var1);
      } else if (!class05001.N(jsonobject, "filtered", true)) {
         return class06068.N(var1);
      } else {
         Iterator<JsonElement> iterator = class05001.N(jsonobject, "events", new JsonArray()).iterator();

         while (iterator.hasNext()) {
            String s = class05001.N(iterator.next().getAsJsonObject(), "id", "");
            if (this.L.contains(s)) {
               return class06068.y(var1);
            }
         }

         JsonArray jsonarray = class05001.N(jsonobject, "redactedTextIndex", new JsonArray());
         return new class06068(var1, this.N(var1, jsonarray, var2));
      }
   }

   @Override
   protected void N(HttpURLConnection var1) {
      IAuthenticationResult iauthenticationresult = this.y();
      var1.setRequestProperty("Authorization", "Bearer " + iauthenticationresult.accessToken());
   }

   @Nullable
   public static class02593 N(String var0) {
      JsonObject jsonobject = class05001.N(var0);
      URI uri = URI.create(class05001.Z(jsonobject, "apiServer"));
      String s = class05001.Z(jsonobject, "apiPath");
      String s1 = class05001.Z(jsonobject, "scope");
      String s2 = class05001.N(jsonobject, "serverId", "");
      String s3 = class05001.Z(jsonobject, "applicationId");
      String s4 = class05001.Z(jsonobject, "tenantId");
      String s5 = class05001.N(jsonobject, "roomId", "Java:Chat");
      String s6 = class05001.Z(jsonobject, "certificatePath");
      String s7 = class05001.N(jsonobject, "certificatePassword", "");
      int i = class05001.N(jsonobject, "hashesToDrop", -1);
      int j = class05001.N(jsonobject, "maxConcurrentRequests", 7);
      JsonArray jsonarray = class05001.t(jsonobject, "fullyFilteredEvents");
      HashSet hashset = new HashSet();
      jsonarray.forEach(var1x -> hashset.add(class05001.N(var1x, "filteredEvent")));
      int k = class05001.N(jsonobject, "connectionReadTimeoutMs", 2000);

      URL url;
      try {
         url = uri.resolve(s).toURL();
      } catch (MalformedURLException malformedurlexception) {
         throw new RuntimeException(malformedurlexception);
      }

      class02571 class02571 = (var2x, var3x) -> {
         JsonObject jsonobjectx = new JsonObject();
         jsonobjectx.addProperty("userId", var2x.id().toString());
         jsonobjectx.addProperty("userDisplayName", var2x.name());
         jsonobjectx.addProperty("server", s2);
         jsonobjectx.addProperty("room", s5);
         jsonobjectx.addProperty("area", "JavaChatRealms");
         jsonobjectx.addProperty("data", var3x);
         jsonobjectx.addProperty("language", "*");
         return jsonobjectx;
      };
      class02588 class02588 = class02588.y(i);
      ExecutorService executorservice = N(j);

      IClientCertificate iclientcertificate;
      try (InputStream inputstream = Files.newInputStream(Path.of(s6))) {
         iclientcertificate = ClientCredentialFactory.createFromCertificate(inputstream, s7);
      } catch (Exception exception1) {
         i.warn("Failed to open certificate file");
         return null;
      }

      ConfidentialClientApplication confidentialclientapplication;
      try {
         confidentialclientapplication = ((Builder)((Builder)ConfidentialClientApplication.builder(s3, iclientcertificate)
                  .sendX5c(true)
                  .executorService(executorservice))
               .authority(String.format(Locale.ROOT, "https://login.microsoftonline.com/%s/", s4)))
            .build();
      } catch (Exception exception) {
         i.warn("Failed to create confidential client application");
         return null;
      }

      ClientCredentialParameters clientcredentialparameters = ClientCredentialParameters.builder(Set.of(s1)).build();
      return new class02573(url, class02571, class02588, executorservice, confidentialclientapplication, clientcredentialparameters, hashset, k);
   }
}
