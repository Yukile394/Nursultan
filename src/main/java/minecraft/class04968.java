package minecraft;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.jspecify.annotations.Nullable;

public class class04968 {
   ExclusionStrategy N = new class04986(this);
   private final Gson y = new GsonBuilder().addSerializationExclusionStrategy(this.N).addDeserializationExclusionStrategy(this.N).create();

   public class04968() {
      super();
   }

   @Nullable
   public <T extends class04942> T N(String var1, Class<T> var2) {
      return (T)this.y.fromJson(var1, var2);
   }

   public String N(JsonElement var1) {
      return this.y.toJson(var1);
   }

   public String N(class04942 var1) {
      return this.y.toJson(var1);
   }
}
