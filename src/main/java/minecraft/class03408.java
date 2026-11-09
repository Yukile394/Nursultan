package minecraft;

import com.mojang.authlib.exceptions.MinecraftClientException.ErrorType;

// $VF: synthetic class
class class03408 {
   static {
      try {
         N[ErrorType.SERVICE_UNAVAILABLE.ordinal()] = 1;
      } catch (NoSuchFieldError nosuchfielderror2) {
      }

      try {
         N[ErrorType.HTTP_ERROR.ordinal()] = 2;
      } catch (NoSuchFieldError nosuchfielderror1) {
      }

      try {
         N[ErrorType.JSON_ERROR.ordinal()] = 3;
      } catch (NoSuchFieldError nosuchfielderror) {
      }
   }
}
