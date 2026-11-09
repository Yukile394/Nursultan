package minecraft;

import com.viaversion.viafabricplus.injection.access.base.ILocalSampleLogger;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public class class02270 extends class02272 implements class02276, ILocalSampleLogger {
   public static final int L = 240;
   private final long[][] u;
   private int i;
   private int R;
   private ProtocolVersion M;

   @Override
   public int L() {
      return this.u.length;
   }

   public class02270(int var1) {
      this(var1, new long[var1]);
   }

   public class02270(int var1, long[] var2) {
      super(var1, var2);
      this.u = new long[240][var1];
   }

   @Override
   public void i() {
      this.i = 0;
      this.R = 0;
   }

   @Override
   public int u() {
      return this.R;
   }

   private int y(int var1) {
      return var1 % 240;
   }

   @Override
   public long N(int var1, int var2) {
      if (var1 >= 0 && var1 < this.R) {
         long[] along = this.u[this.y(this.i + var1)];
         if (var2 >= 0 && var2 < along.length) {
            return along[var2];
         } else {
            throw new IndexOutOfBoundsException(var2 + " out of bounds for dimensions " + along.length);
         }
      } else {
         throw new IndexOutOfBoundsException(var1 + " out of bounds for length " + this.R);
      }
   }

   @Override
   public long N(int var1) {
      return this.N(var1, 0);
   }

   @Override
   protected void N() {
      int ix = this.y(this.i + this.R);
      System.arraycopy(this.y, 0, this.u[ix], 0, this.y.length);
      if (this.R < 240) {
         this.R++;
      } else {
         this.i = this.y(this.i + 1);
      }
   }

   public ProtocolVersion viaFabricPlus$getForcedVersion() {
      return this.M;
   }

   public void viaFabricPlus$setForcedVersion(ProtocolVersion var1) {
      this.M = var1;
   }
}
