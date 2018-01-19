//function description
//take an input and check whether it is a number in a given range or whether it is a name.

function changeMode()
{
	var divName = document.getElementById("nameMode");
	var divNumber = document.getElementById("numberMode");
	if(document.getElementById("mode").checked == true)
	{
		divName.style.visibility="visible";
		divNumber.style.visibility="hidden";
	}
	else
	{
		divNumber.style.visibility="visible";
		divName.style.visibility="hidden";
	}
}
	

function analyseInput(){
	var element=numOrName.value.trim();
	if(element=="")
		printInvalid();
	else
	{
		if(isNaN(element))
			analyseName(element);
		else
			analyseNumber(element);
	}
}

function analyseName()
{
	var flag=0;
	var name=nameInput.value;
	var age=ageInput.value;
	var gender;
	var title;
	var description;
	if(isNaN(name) && age!="" && name!="")
	{
		if(document.getElementById("male").checked == true)
		{
			gender="Male";
			title="Mr";
		}
		else if(document.getElementById("female").checked == true)
		{
			gender="Female";
			title="Miss";
		}
		else
		{
			document.getElementById("displayName").innerHTML="Select Gender";
			flag=1;
		}
		
		if(flag==0)
		{	
			alert("hello");
			description="The name is "+title+" "+name+"";
			document.getElementById("displayName").innerHTML=description;
			var table = document.getElementById("displayTable");
			var row="<td>" + name + "</td><td>" + gender + "</td><td>" + age + "</td><td>" + description + "</td>";
			var tbody = document.querySelector("#displayTable tbody");
			var tr = document.createElement("tr");
			tr.innerHTML = row;
			tbody.appendChild(tr);
		}
	}
	else
		document.getElementById("displayName").innerHTML="Enter all valid fields!";
}
function analyseNumber()
{
	element=numberInput.value;
	if(isNaN(element) || element=="")
			printInvalid();
	else
	{
		if(element>=0 && element<=1000)
				{
					if(element<50)
						document.getElementById("displayNumber").innerHTML="Number is below 50";
					else if(element>=50 && element<=100)
						document.getElementById("displayNumber").innerHTML="Number is between 50 and 100";
					else
						document.getElementById("displayNumber").innerHTML="Number is greater than 100";
				}
				else
					printInvalid();
	}
}
function printInvalid()
{
	document.getElementById("displayNumber").innerHTML="invalid input";
}
	