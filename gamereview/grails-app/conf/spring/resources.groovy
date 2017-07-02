import gamereview.UserPasswordEncoderListener
import gamereview.UserPasswordEncoderListener
import gamereview.UserPasswordEncoderListener
import gamereview.UserPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener, ref('hibernateDatastore'))
    userPasswordEncoderListener(UserPasswordEncoderListener, ref('hibernateDatastore'))
    userPasswordEncoderListener(UserPasswordEncoderListener, ref('hibernateDatastore'))
    userPasswordEncoderListener(UserPasswordEncoderListener, ref('hibernateDatastore'))
}
