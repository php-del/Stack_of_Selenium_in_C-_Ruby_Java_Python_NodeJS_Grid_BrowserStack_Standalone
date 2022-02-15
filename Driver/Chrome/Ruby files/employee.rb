class Employee
	@empfirstname
	@emplastname
	@empid

   def setfirstName(empfirstname)
   @empfirstname = empfirstname
   end

   def setlastName(emplastname)
   @emplastname = emplastname
   end

   def setempid(empid)
   @empid = empid
   end

   def getfirstname()
   puts "First Name of the employee is #{@empfirstname}"
   end

   def getlastname()
   puts "Last Name of the employee is #{@emplastname}"
   end

   def getempid()
   puts "ID of the employee is #{@empid}"
   end

	def emptask()
		puts 'Employee is working'
	end
end

emp=Employee.new
#puts 'The employee name is'+' '+emp.empfirstname+' '+emp.emplastname+" "+'and the employee ID is'+' '+emp.empid+'.'
emp.setfirstName('Pratik')
emp.setlastName('Pathare')
emp.setempid('1307')

emp.getfirstname()
emp.getlastname()
emp.getempid()
emp.emptask()