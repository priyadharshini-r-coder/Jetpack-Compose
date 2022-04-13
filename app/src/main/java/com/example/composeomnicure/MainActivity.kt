package com.example.composeomnicure

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeomnicure.ui.theme.ComposeOmnicureTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeOmnicureTheme {

                 SignUp()
                 SplashFunction()
                 LocalCareProvider()
                //SelectHospital()
                AddPatient()
               AddPatientVitals()
               // Filter()
                //LocalCareProviderSecond()
            }
        }

    }
 @Composable
 fun Filter()
 {

 }
   @Composable
    fun AddPatientVitals() {
        val state = rememberScrollState()
        LaunchedEffect(Unit) { state.animateScrollTo(100) }
        Column(
            Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.gray_300)).verticalScroll(state)

        ) {

            Row(
                Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {


                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = "Add New Patient")
                            },
                            navigationIcon = {
                                IconButton(onClick = { }) {
                                    Icon(painterResource(id = R.drawable.ic_imageback), "null")
                                }
                            },
                            backgroundColor = colorResource(id = R.color.text_color_welcome),
                            contentColor = Color.White,
                            elevation = 12.dp
                        )
                    }, content = {

                    }

                )
            }

            Box(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(70.dp)
                    .background(color = Color.White, shape = RectangleShape)
            ) {


                Row(Modifier.padding(10.dp)) {

                    val radioOptions = listOf("No", "Yes")
                    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[1]) }
                    val selectedGender = remember { mutableStateOf("") }
                    Text(
                        text = "Supplement \nOxygen?", modifier = Modifier
                            .padding(start = 2.dp)
                            .padding(end = 2.dp)
                    )
                    val mCheckedState = remember { mutableStateOf(false) }
                    Row(
                        Modifier
                            .padding(top = 5.dp)
                            .padding(start = 10.dp)
                    )
                    {


                        RadioButton(selected = selectedGender.value == Details.male, onClick = {
                            selectedGender.value = Details.male
                        })
                        Spacer(modifier = Modifier.size(10.dp))
                        Text(Details.male)
                        Spacer(modifier = Modifier.size(10.dp))
                        RadioButton(selected = selectedGender.value == Details.female, onClick = {
                            selectedGender.value = Details.female
                        })
                        Spacer(modifier = Modifier.size(10.dp))
                        Text(Details.female)
                    }

                }
            }

            Box(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(130.dp)
                    .background(color = Color.White, shape = RectangleShape)
            )

            {

                Column()
                {
                    val radioOptions = listOf("Alert", "Pain", "Voice", "Unresponsive")
                    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[3]) }
                    val selectedGender = remember { mutableStateOf("") }

                    Text(text = "What is the patient AVPU?", modifier = Modifier.padding(10.dp))
                    Row(
                        Modifier
                            .padding(10.dp)
                            .padding(start = 10.dp)
                    )
                    {


                        RadioButton(selected = selectedGender.value == Patient.alert, onClick = {
                            selectedGender.value = Patient.alert
                        })
                        Spacer(modifier = Modifier.size(5.dp))
                        Text(Patient.alert)
                        Spacer(modifier = Modifier.padding(start = 50.dp))

                        RadioButton(selected = selectedGender.value == Patient.pain, onClick = {
                            selectedGender.value = Patient.pain
                        })
                        Spacer(modifier = Modifier.size(5.dp))
                        Text(Patient.pain)
                    }
                    Row( Modifier
                        .padding(10.dp)
                        .padding(start = 10.dp))
                    {

                        RadioButton(selected = selectedGender.value == Patient.voice, onClick = {
                            selectedGender.value = Patient.voice
                        })
                        Spacer(modifier = Modifier.size(5.dp))
                        Text(Patient.voice)
                        Spacer(modifier = Modifier.padding(start = 50.dp))
                        RadioButton(
                            selected = selectedGender.value == Patient.unresponsive,
                            onClick = {
                                selectedGender.value = Patient.unresponsive
                            })
                        Spacer(modifier = Modifier.size(5.dp))
                        Text(Patient.unresponsive)
                    }
                }


            }



            Box(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(70.dp)
                    .background(color = Color.White, shape = RectangleShape)
            ) {


                Row(Modifier.padding(10.dp)) {

                    val radioOptions = listOf("No", "Yes")
                    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[1]) }
                    val selectedGender = remember { mutableStateOf("") }
                    Text(
                        text = "Mechanical \nVentilation?", modifier = Modifier
                            .padding(start = 2.dp)
                            .padding(end = 2.dp)
                    )
                    val mCheckedState = remember { mutableStateOf(false) }
                    Row(
                        Modifier
                            .padding(top = 5.dp)
                            .padding(10.dp)
                    )
                    {


                        RadioButton(selected = selectedGender.value == Details.male, onClick = {
                            selectedGender.value = Details.male
                        })
                        Spacer(modifier = Modifier.size(10.dp))
                        Text(Details.male)
                        Spacer(modifier = Modifier.size(10.dp))
                        RadioButton(selected = selectedGender.value == Details.female, onClick = {
                            selectedGender.value = Details.female
                        })
                        Spacer(modifier = Modifier.size(10.dp))
                        Text(Details.female)
                    }

                }
            }



            Box(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(70.dp)
                    .background(color = Color.White, shape = RectangleShape)
            ) {


                Row(Modifier.padding(10.dp)) {

                    val radioOptions = listOf("No", "Yes")
                    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[1]) }
                    val selectedGender = remember { mutableStateOf("") }
                    Text(
                        text = "Non-invasive \nVentilation?", modifier = Modifier
                            .padding(start = 2.dp)
                            .padding(end = 2.dp)
                    )
                    val mCheckedState = remember { mutableStateOf(false) }
                    Row(
                        Modifier
                            .padding(top = 5.dp)
                            .padding(start = 10.dp)
                    )
                    {


                        RadioButton(selected = selectedGender.value == Details.male, onClick = {
                            selectedGender.value = Details.male
                        })
                        Spacer(modifier = Modifier.size(10.dp))
                        Text(Details.male)
                        Spacer(modifier = Modifier.size(10.dp))
                        RadioButton(selected = selectedGender.value == Details.female, onClick = {
                            selectedGender.value = Details.female
                        })
                        Spacer(modifier = Modifier.size(10.dp))
                        Text(Details.female)
                    }


                }
            }
            Box(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(70.dp)
                    .background(color = Color.White, shape = RectangleShape)
            )

            {
                Column(Modifier.padding(10.dp)) {
                    val radioOptions = listOf("No", "Yes", "Pending")
                    val (selectedOption, onOptionSelected) = remember {
                        mutableStateOf(
                            radioOptions[2]
                        )
                    }
                    val selectedGender = remember { mutableStateOf("") }
                    Text(
                        text = "COVID Positive?", modifier = Modifier
                            .padding(start = 2.dp)
                            .padding(end = 2.dp)
                    )
                    val mCheckedState = remember { mutableStateOf(false) }
                    Row(
                        Modifier
                            .padding(top = 5.dp)
                            .padding(start = 20.dp)
                    )
                    {


                        RadioButton(selected = selectedGender.value == Details.male, onClick = {
                            selectedGender.value = Details.male
                        })
                        Spacer(Modifier.padding(start = 5.dp))
                        Text(Details.male)
                        Spacer(Modifier.padding(start = 30.dp))

                        RadioButton(selected = selectedGender.value == Details.female, onClick = {
                            selectedGender.value = Details.female
                        })
                        Spacer(Modifier.padding(start = 5.dp))
                        Text(Details.female)
                        Spacer(Modifier.padding(start = 30.dp))
                        RadioButton(
                            selected = selectedGender.value == Details.pending,
                            onClick = {
                                selectedGender.value = Details.pending
                            })
                        Spacer(Modifier.padding(start = 5.dp))
                        Text(Details.pending)
                    }

                }
            }
            Box(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(50.dp)
                    .background(color = Color.White, shape = RectangleShape)
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                )
                {
                    val isChecked = remember { mutableStateOf(false) }
                    Checkbox(
                        false,

                        onCheckedChange = {
                            isChecked.value = it
                        },


                        )

                    Text("Add patient vitals", Modifier.padding(start=5.dp))
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(50.dp)
                    .background(color = Color.White, shape = RectangleShape)
            )
            {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                )
                {
                    val isChecked = remember { mutableStateOf(false) }
                    Checkbox(
                        false,

                        onCheckedChange = {
                            isChecked.value = it
                        },


                        )

                    Text("Glasgow Coma Scale(GCS)", Modifier.padding(start=5.dp))
                }


            }

            Box(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(50.dp)
                    .background(color = Color.White, shape = RectangleShape)
            ) {


                Row(Modifier.padding(10.dp)) {

                    Image(painterResource(id = R.drawable.wifi), "null")
                    Text("Connect to a device", Modifier.padding(start=5.dp))
                }


            }
            Box(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(50.dp)
                    .background(color = Color.White, shape = RectangleShape)
            ) {


                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                )
                {
                    val isChecked = remember { mutableStateOf(false) }
                    Checkbox(
                        false,

                        onCheckedChange = {
                            isChecked.value = it
                        },


                        )

                    Text("Mark consult as urgent", Modifier.padding(start=5.dp))
                }


            }
            Box(

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(100.dp)
                    .background(color = Color.White, shape = RectangleShape)
            ) {


                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                )
                {
                    Text("Chief complaint:", Modifier.padding(5.dp),fontWeight = FontWeight.Bold)



                }


            }
           Button(
                  onClick = { },
                  modifier = Modifier
                      .fillMaxWidth()
                      .height(60.dp)
                      .padding(10.dp)
                      ,colors= ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.text_title_color)),
              ) {
                  Text(text = "CONTINUE", fontSize = 16.sp, color = Color.White)


              }
          }


                }
        }



    object Details {
        const val male = "No"
        const val female = "Yes"
        const val pending = "Pending"
    }

    object Patient {
        const val alert = "Alert"
        const val pain = "Pain"
        const val voice = "Voice"
        const val unresponsive = "Unresponsive"
    }

     @SuppressLint("ResourceType")
    @Composable
    fun AddPatient() {
          Column(
              Modifier
                  .fillMaxSize()
                  .background(colorResource(id = R.color.gray_300))

          ) {
              val radioOptions = listOf("Email address", "Phone Number")
              val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[1]) }
              val selectedGender = remember { mutableStateOf("") }
              Row(
                  Modifier
                      .fillMaxWidth()
                      .height(50.dp)
              ) {


                  Scaffold(
                      topBar = {
                          TopAppBar(
                              title = {
                                  Text(text = "Add New Patient")
                              },
                              navigationIcon = {
                                  IconButton(onClick = { }) {
                                      Icon(painterResource(id = R.drawable.ic_imageback), "null")
                                  }
                              },
                              backgroundColor = colorResource(id = R.color.text_color_welcome),
                              contentColor = Color.White,
                              elevation = 12.dp
                          )
                      }, content = {

                      }

                  )
              }

              Row(Modifier.padding(10.dp)) {

                  Text(
                      text = "Unknown Patient", modifier = Modifier
                          .padding(start = 2.dp)
                          .padding(end = 2.dp)
                  )
                  val mCheckedState = remember { mutableStateOf(false) }

                  // Creating a Switch, when value changes,
                  // it updates mCheckedState value
                  Switch(
                      checked = mCheckedState.value,
                      onCheckedChange = { mCheckedState.value = it })

              }
              Box(

                  modifier = Modifier
                      .fillMaxWidth()
                      .padding(8.dp)
                      .height(50.dp)
                      .background(color = Color.White, shape = RectangleShape)
              )

              {
                  Text(text = "First Name", modifier = Modifier.padding(10.dp))

              }
              Box(

                  modifier = Modifier
                      .fillMaxWidth()
                      .padding(8.dp)
                      .height(50.dp)
                      .background(color = Color.White, shape = RectangleShape)
              )

              {
                  Text(text = "Last Name", Modifier.padding(10.dp))
              }


              Box(

                  modifier = Modifier
                      .fillMaxWidth()
                      .padding(8.dp)
                      .height(50.dp)
                      .background(color = Color.White, shape = RectangleShape)
              )
              {
                  Text(text = "DOB(mm/dd/yyyy)", modifier = Modifier.padding(10.dp))
                  Image(
                      painter = painterResource(R.drawable.calendar_gray),
                      contentDescription = "visibility", modifier = Modifier
                          .align(Alignment.BottomEnd)
                          .padding(10.dp)
                  )
              }



              Box(
                  modifier = Modifier
                      .fillMaxWidth()
                      .padding(8.dp)
                      .height(50.dp)
                      .background(color = Color.White, shape = RectangleShape),
              )
              {

                  Row(modifier = Modifier.padding(10.dp))
                  {
                      Text(text = "Gender", modifier = Modifier.padding(end = 50.dp))


                      Spacer(
                          modifier = Modifier
                              .padding(start = 70.dp)
                              .padding(top = 10.dp)
                      )

                      RadioButton(selected = selectedGender.value == Details.male, onClick = {
                          selectedGender.value = Details.male
                      })
                      Spacer(modifier = Modifier.size(10.dp))
                      Text(Details.male)
                      Spacer(modifier = Modifier.size(10.dp))
                      RadioButton(selected = selectedGender.value == Details.female, onClick = {
                          selectedGender.value = Details.female
                      })
                      Spacer(modifier = Modifier.size(10.dp))
                      Text(Details.female)
                  }

              }

              Box(
                  modifier = Modifier
                      .fillMaxWidth()
                      .padding(8.dp)
                      .height(50.dp)
                      .background(color = Color.White, shape = RectangleShape),
              )
              {
                  Text(text = "Location", Modifier.padding(10.dp))
              }
              Box(
                  modifier = Modifier
                      .fillMaxWidth()
                      .padding(8.dp)
                      .height(50.dp)
                      .background(color = Color.White, shape = RectangleShape),
              )
              {


              }

              Box(
                  modifier = Modifier
                      .fillMaxWidth()
                      .padding(8.dp)
                      .height(50.dp)
                      .background(color = Color.White, shape = RectangleShape),
              )
              {
                  Text(text = "Select Ward Optional", Modifier.padding(10.dp))

              }



              Spacer(modifier = Modifier.padding(10.dp))

              Button(
                  onClick = { },
                  modifier = Modifier
                      .fillMaxWidth()
                      .height(60.dp)
                      .padding(10.dp)
                      ,colors= ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.text_title_color)),
              ) {
                  Text(text = "CONTINUE", fontSize = 16.sp, color = Color.White)


              }
          }

      }


              object Details {
                  const val male = "Male"
                  const val female = "Female"
              }



              @Composable
              fun SelectHospital() {
                  Column(Modifier.fillMaxSize())
                  {
                      Image(painterResource(id = R.drawable.ic_imageback), "null")
                      Spacer(Modifier.size(50.dp))
                      Text("Select a hospital", fontSize = 16.sp)

                  }
              }


              @Composable
              fun SignUp() {
                  Column(
                      Modifier
                          .fillMaxWidth()
                          .padding(top = 50.dp)
                  ) {


                      Row(modifier = Modifier.fillMaxWidth()) {

                          Image(
                              painter = painterResource(id = R.drawable.ic_logo),
                              contentDescription = "null",
                              modifier = Modifier
                                  .padding(10.dp)

                                  .width(50.dp)
                                  .height(50.dp),

                              )
                          Text(
                              text = buildAnnotatedString {
                                  withStyle(
                                      style = SpanStyle(
                                          colorResource(id = R.color.text_color_welcome),
                                          fontSize = 30.sp
                                      )
                                  )
                                  {
                                      append("Welcome to \nOmnicure Now")
                                  }
                              },


                              )


                      }
                      Spacer(modifier = Modifier.size(10.dp))
                      Text(
                          text = "Select your account",
                          modifier = Modifier
                              .fillMaxWidth()
                              .padding(10.dp),
                          colorResource(id = R.color.text_color),
                          fontSize = 18.sp
                      )
                      Spacer(modifier = Modifier.size(10.dp))
                      Card(
                          shape = RoundedCornerShape(10.dp),
                          modifier = Modifier
                              .padding(10.dp)
                              .fillMaxWidth()
                              .height(70.dp)
                              .border(2.dp, Color.Black)
                      ) {
                          Column(
                              modifier = Modifier
                                  .fillMaxWidth()
                                  .padding(start = 8.dp),

                              ) {
                              Text(
                                  "Remote Provider", fontWeight = FontWeight.Bold,
                                  fontSize = 16.sp, color = Color.Black
                              )
                              Text(
                                  text = "I am a critical care professional \nproviding remote support",

                                  fontSize = 14.sp, color = Color.Black
                              )


                          }
                      }
                      Card(
                          shape = RoundedCornerShape(10.dp),
                          modifier = Modifier
                              .padding(10.dp)
                              .fillMaxWidth()
                              .height(70.dp)
                              .border(2.dp, Color.Black)
                      ) {
                          Column(
                              modifier = Modifier
                                  .fillMaxWidth()
                                  .padding(start = 8.dp),

                              ) {
                              Text(
                                  "Local Care Provider", fontWeight = FontWeight.Bold,
                                  fontSize = 16.sp, color = Color.Black
                              )
                              Text(
                                  text = "I am a health care professional \ntaking care of patients onsite",

                                  fontSize = 14.sp, color = Color.Black
                              )


                          }
                      }
                      Box(modifier = Modifier.fillMaxSize()) {

                          Text(modifier = Modifier
                              .padding(start = 70.dp)
                              .padding(top = 20.dp), text = buildAnnotatedString {
                              withStyle(style = SpanStyle(colorResource(id = R.color.text_color)),)
                              {
                                  append("Already have account?")
                              }
                              withStyle(style = SpanStyle(colorResource(id = R.color.logo_tint)))
                              {
                                  append("LOG IN")
                              }
                          })
                      }
                  }
              }

              @Composable
              fun SplashFunction() {
                  Column(
                      modifier = Modifier.fillMaxSize(),
                      verticalArrangement = Arrangement.Center,
                      horizontalAlignment = Alignment.CenterHorizontally
                  ) {
                      Image(
                          painter = painterResource(id = R.drawable.ic_logo),
                          contentDescription = "null"
                      )
                      Image(
                          painter = painterResource(id = R.drawable.logo_text),
                          "null",
                          modifier = Modifier
                              .width(200.dp)
                              .height(100.dp)

                      )

                  }
              }

              @Composable
              fun LocalCareProvider() {
                  var expanded by remember { mutableStateOf(false) }
                  val list = listOf("+1", "91")
                  Column(
                      Modifier
                          .fillMaxWidth()
                          .padding(top = 10.dp)
                          .padding(start = 10.dp)
                          .padding(bottom = 10.dp, end = 10.dp)
                  ) {
                      Row(
                          modifier = Modifier.align(Alignment.Start)
                      )
                      {
                          Image(
                              painterResource(id = R.drawable.ic_forward),
                              contentDescription = null,
                          )
                      }
                      Row(
                          modifier = Modifier.align(Alignment.End)
                      )
                      {
                          Image(
                              painterResource(id = R.drawable.ic_step1),
                              contentDescription = null
                          )
                      }

                      Spacer(Modifier.size(10.dp))
                      Text(
                          text = buildAnnotatedString {
                              withStyle(
                                  style = SpanStyle(
                                      colorResource(id = R.color.text_color_welcome),
                                      fontSize = 16.sp,
                                      fontWeight = FontWeight.Bold,

                                      )
                              )
                              {
                                  append("Sign up as Remote Provider")
                              }
                          }, modifier = Modifier.padding(10.dp)
                      )

                      OutlinedTextField(
                          value = "",

                          {

                          },

                          modifier = Modifier
                              .fillMaxWidth()
                              .padding(8.dp),

                          label = {
                              Text(text = "First name")
                          },
                      )
                      OutlinedTextField(
                          value = "",

                          {

                          },

                          modifier = Modifier
                              .fillMaxWidth()
                              .padding(8.dp),

                          label = {
                              Text(text = "Last name")
                          },
                      )
                      OutlinedTextField(
                          value = "",

                          {

                          },

                          modifier = Modifier
                              .fillMaxWidth()
                              .padding(8.dp),

                          label = {
                              Text(text = "Email Address")
                          },
                      )
                      OutlinedTextField(
                          value = "",
                          onValueChange =
                          {

                          },
                          modifier = Modifier
                              .fillMaxWidth()
                              .padding(8.dp),
                          label = {
                              Text(text = "Password")
                          },
                          trailingIcon = {
                              IconButton(onClick = {

                              }) {
                                  Icon(
                                      painter = painterResource(R.drawable.ic_visibility),
                                      contentDescription = "visibility"
                                  )

                              }
                          },
                      )

                      OutlinedTextField(
                          value = "",

                          {

                          },

                          modifier = Modifier
                              .fillMaxWidth()
                              .padding(8.dp),

                          label = {
                              Text(text = "Phone Number")
                          },


                          )




                      Button(
                          onClick = { /*TODO*/ },
                          modifier = Modifier
                              .fillMaxWidth()
                              .padding(20.dp), enabled = false
                      ) {
                          Text(text = "Next")

                      }

                      Box(
                          modifier = Modifier
                              .fillMaxWidth()
                              .height(50.dp)
                      ) {

                          Text(modifier = Modifier
                              .padding(start = 70.dp)
                              .padding(top = 15.dp), text = buildAnnotatedString {
                              withStyle(style = SpanStyle(colorResource(id = R.color.text_color)),)
                              {
                                  append("Already have account? ")
                              }
                              withStyle(style = SpanStyle(colorResource(id = R.color.logo_tint)))
                              {
                                  append("LOG IN")
                              }
                          })
                      }
                  }
              }

              @Composable
              fun LocalCareProviderSecond() {
                  val checkedState = remember { mutableStateOf(false) }
                  Column(
                      Modifier
                          .fillMaxWidth()
                          .padding(top = 20.dp)
                  ) {
                      Row(
                          modifier = Modifier.align(Alignment.Start)
                      )
                      {
                          Image(
                              painterResource(id = R.drawable.ic_forward),
                              contentDescription = null,
                          )
                      }
                      Row(
                          modifier = Modifier.align(Alignment.End)
                      )
                      {
                          Image(
                              painterResource(id = R.drawable.ic_step1),
                              contentDescription = null
                          )
                      }

                      Spacer(Modifier.size(10.dp))
                      Text(
                          text = buildAnnotatedString {
                              withStyle(
                                  style = SpanStyle(
                                      colorResource(id = R.color.text_color_welcome),
                                      fontSize = 16.sp,
                                      fontWeight = FontWeight.Bold,
                                  )
                              )
                              {
                                  append("Sign up as Remote Provider")
                              }
                          }, modifier = Modifier.padding(10.dp)
                      )

                      OutlinedTextField(
                          value = "",

                          {

                          },
                          modifier = Modifier
                              .fillMaxWidth()
                              .padding(10.dp),

                          label = {
                              Text(text = "Select Provider Type")
                              colorResource(id = R.color.text_title_color)
                          },
                          leadingIcon = {
                              Icon(
                                  painter = painterResource(id = R.drawable.account),
                                  contentDescription = "null"
                              )
                          }


                      )
                      OutlinedTextField(
                          value = "",

                          {

                          },

                          modifier = Modifier
                              .fillMaxWidth()
                              .padding(10.dp),


                          label = {

                              Text(
                                  text = "NPI(National Provider Identifier)",

                                  )
                          },
                          leadingIcon = {
                              Icon(
                                  painter = painterResource(id = R.drawable.file),
                                  contentDescription = "null"
                              )
                          }

                      )

                      Button(
                          onClick = { /*TODO*/ },
                          modifier = Modifier
                              .fillMaxWidth()
                              .padding(20.dp)
                              .padding(top = 250.dp), enabled = false
                      ) {
                          Text(text = "Verify my account")

                      }
                      Box(
                          modifier = Modifier
                              .fillMaxWidth()
                              .height(50.dp)
                      ) {

                          Text(modifier = Modifier
                              .padding(start = 70.dp)
                              .padding(top = 15.dp), text = buildAnnotatedString {
                              withStyle(style = SpanStyle(colorResource(id = R.color.text_color)),)
                              {
                                  append("Already have account? ")
                              }
                              withStyle(style = SpanStyle(colorResource(id = R.color.logo_tint)))
                              {
                                  append("LOG IN")
                              }
                          })

                      }
                  }
              }











