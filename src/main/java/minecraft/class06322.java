package minecraft;

import com.jcraft.jogg.Packet;
import com.jcraft.jogg.Page;
import com.jcraft.jogg.StreamState;
import com.jcraft.jogg.SyncState;
import com.jcraft.jorbis.Block;
import com.jcraft.jorbis.Comment;
import com.jcraft.jorbis.DspState;
import com.jcraft.jorbis.Info;
import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import org.jspecify.annotations.Nullable;

public class class06322 implements class02915 {
   private static final int y = 8192;
   private static final int L = -1;
   private static final int u = 0;
   private static final int i = 1;
   private static final int R = -1;
   private static final int M = 0;
   private static final int B = 1;
   private final SyncState Z = new SyncState();
   private final Page z = new Page();
   private final StreamState U = new StreamState();
   private final Packet E = new Packet();
   private final Info W = new Info();
   private final DspState m = new DspState();
   private final Block P = new Block(this.m);
   private final AudioFormat s;
   private final InputStream T;
   private long b;
   private long j = Long.MAX_VALUE;

   private boolean L() throws IOException {
      int ix = this.Z.buffer(8192);
      byte[] abyte = this.Z.data;
      int jx = this.T.read(abyte, ix, 8192);
      if (jx == -1) {
         return false;
      } else {
         this.Z.wrote(jx);
         return true;
      }
   }

   private long L(int var1) {
      long ix = this.b + var1;
      long jx;
      if (ix > this.j) {
         jx = this.j - this.b;
         this.b = this.j;
      } else {
         this.b = ix;
         jx = var1;
      }

      return jx;
   }

   public class06322(InputStream var1) throws IOException {
      super();
      this.T = var1;
      Comment comment = new Comment();
      Page page = this.u();
      if (page == null) {
         throw new IOException("Invalid Ogg file - can't find first page");
      } else {
         Packet packet = this.N(page);
         if (y(this.W.synthesis_headerin(comment, packet))) {
            throw new IOException("Invalid Ogg identification packet");
         } else {
            for (int ix = 0; ix < 2; ix++) {
               packet = this.i();
               if (packet == null) {
                  throw new IOException("Unexpected end of Ogg stream");
               }

               if (y(this.W.synthesis_headerin(comment, packet))) {
                  throw new IOException("Invalid Ogg header packet " + ix);
               }
            }

            this.m.synthesis_init(this.W);
            this.P.init(this.m);
            this.s = new AudioFormat(this.W.rate, 16, this.W.channels, true, false);
         }
      }
   }

   @Nullable
   private Packet i() throws IOException {
      while (true) {
         int ix = this.U.packetout(this.E);
         switch (ix) {
            case -1:
               throw new IOException("Failed to parse packet");
            case 0:
               Page page = this.u();
               if (page == null) {
                  return null;
               }

               if (!y(this.U.pagein(page))) {
                  break;
               }

               throw new IOException("Failed to parse page");
            case 1:
               return this.E;
            default:
               throw new IllegalStateException("Unknown packet decode result: " + ix);
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.T.close();
   }

   @Nullable
   private Page u() throws IOException {
      while (true) {
         int ix = this.Z.pageout(this.z);
         switch (ix) {
            case -1:
               throw new IOException("Corrupt or missing data in bitstream");
            case 0:
               if (this.L()) {
                  break;
               }

               return null;
            case 1:
               if (this.z.eos() != 0) {
                  this.j = this.z.granulepos();
               }

               return this.z;
            default:
               throw new IllegalStateException("Unknown page decode result: " + ix);
         }
      }
   }

   private static boolean y(int var0) {
      return var0 < 0;
   }

   private static void N(float[] var0, int var1, long var2, FloatConsumer var4) {
      for (int ix = var1; ix < var1 + var2; ix++) {
         var4.accept(var0[ix]);
      }
   }

   private static void N(float[] var0, int var1, float[] var2, int var3, long var4, FloatConsumer var6) {
      for (int ix = 0; ix < var4; ix++) {
         var6.accept(var0[var1 + ix]);
         var6.accept(var2[var3 + ix]);
      }
   }

   @Override
   public boolean N(FloatConsumer var1) throws IOException {
      float[][][] afloat = new float[1][][];
      int[] aint = new int[this.W.channels];
      Packet packet = this.i();
      if (packet == null) {
         return false;
      } else if (y(this.P.synthesis(packet))) {
         throw new IOException("Can't decode audio packet");
      } else {
         this.m.synthesis_blockin(this.P);

         int ix;
         while ((ix = this.m.synthesis_pcmout(afloat, aint)) > 0) {
            float[][] afloat1 = afloat[0];
            long jx = this.L(ix);
            switch (this.W.channels) {
               case 1:
                  N(afloat1[0], aint[0], jx, var1);
                  break;
               case 2:
                  N(afloat1[0], aint[0], afloat1[1], aint[1], jx, var1);
                  break;
               default:
                  N(afloat1, this.W.channels, aint, jx, var1);
            }

            this.m.synthesis_read(ix);
         }

         return true;
      }
   }

   private static void N(float[][] var0, int var1, int[] var2, long var3, FloatConsumer var5) {
      for (int ix = 0; ix < var3; ix++) {
         for (int jx = 0; jx < var1; jx++) {
            int k = var2[jx];
            float f = var0[jx][k + ix];
            var5.accept(f);
         }
      }
   }

   private Packet N(Page var1) throws IOException {
      this.U.init(var1.serialno());
      if (y(this.U.pagein(var1))) {
         throw new IOException("Failed to parse page");
      } else {
         int ix = this.U.packetout(this.E);
         if (ix != 1) {
            throw new IOException("Failed to read identification packet: " + ix);
         } else {
            return this.E;
         }
      }
   }

   @Override
   public AudioFormat N() {
      return this.s;
   }
}
