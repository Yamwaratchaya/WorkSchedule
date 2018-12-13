package yamwaratchaya.th.co.tanproduct.workschedule;

import android.os.Parcel;
import android.os.Parcelable;

public class RealtimeModel implements Parcelable {

    private int Sensor;

    public RealtimeModel() {
    }      // getter

    public RealtimeModel(int sensor) {
        Sensor = sensor;
    }   // setter

    protected RealtimeModel(Parcel in) {
        Sensor = in.readInt();
    }

    public static final Creator<RealtimeModel> CREATOR = new Creator<RealtimeModel>() {
        @Override
        public RealtimeModel createFromParcel(Parcel in) {
            return new RealtimeModel(in);
        }

        @Override
        public RealtimeModel[] newArray(int size) {
            return new RealtimeModel[size];
        }
    };

    public int getSensor() {
        return Sensor;
    }

    public void setSensor(int sensor) {
        Sensor = sensor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(Sensor);
    }
}
