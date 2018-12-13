package yamwaratchaya.th.co.tanproduct.workschedule;

import android.os.Parcel;
import android.os.Parcelable;

public class UserModel implements Parcelable {

    private String uidString, nameString, messageString;

    public UserModel() {
    }   // Constructor Getter Type


    public UserModel(String uidString, String nameString, String messageString) {
        this.uidString = uidString;
        this.nameString = nameString;
        this.messageString = messageString;
    }   // Constructor Setter Type

    protected UserModel(Parcel in) {
        uidString = in.readString();
        nameString = in.readString();
        messageString = in.readString();
    }

    public static final Creator<UserModel> CREATOR = new Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel in) {
            return new UserModel(in);
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };

    public String getUidString() {
        return uidString;
    }

    public void setUidString(String uidString) {
        this.uidString = uidString;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getMessageString() {
        return messageString;
    }

    public void setMessageString(String messageString) {
        this.messageString = messageString;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uidString);
        dest.writeString(nameString);
        dest.writeString(messageString);
    }
}
