## Organization Management Workflow Project Using Springboot Framework, Lombok Library.

### Details : 
              In this project I created entity class i.e Country. After that created controller i.e MainController for creating api. After that created service class i.e MainService. 
              Then I created dao class i.e MainDao for writing the logic. 
              In controller class created api for :
                                                    1.  Create api for Add Country.
                                                    2.  Create api for Update Country.
                                                    3.  Create api for Delete Country.
                                                    4.  Create api for Get All Records.
                                                    5.  Create api for Get Perticular Record.
              And then in Dao class written logic for above api.                                              

              Then using Lombok Library created entity class i.e Employee.
              Lombok Library automatically generate the getter setter method, toString method, argument constructor, no argument constructor using annotation like @Getter, 
              @Setter, @ToString, @AllArgsConstructor, @NoArgsConstructor.
              After that in controller class created api for :
                                                              1. Create api for Add Employee.
                                                              2. Create api for Update Employee.
                                                              3. Create api for Delete Employee.
                                                              4. Create api for Get All Records.
                                                              5. Create api for Get Perticular Record.
                                                              6. Create api for login.
                                                              7. Update only status of particular employee. 
                                                                  - case 1 if employee status is active change to inactive 
                                                                  - case 2 if employee status is inactive change to active
                                                                  - case 3 if employee status is suspend do not change its status 
                                                                  - For that I given response in message format 
                                                                      	- for case 1 & 2 => Status update successfully
                                                                      	- for case 3 => Suspended employee does not change status 
